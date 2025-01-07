package com.lucky

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val myHandler = CoroutineExceptionHandler {coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Exception in coroutine example Lucky!")
        }
        job.join()

        val differed = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Exception from async")
        }

        try {
            differed.await()
        } catch (e: ArithmeticException) {
            println("Caught Arithmatic exception: ${e.localizedMessage}")
        }

    }
}