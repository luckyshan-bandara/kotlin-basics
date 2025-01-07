package com.lucky.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main() {
    runBlocking {
        val firstDiferred = async { getFirstValue() }
        val secondDeferred = async { getSecondValue() }

        println("Doing some processing gere")
        delay(500L)
        println("waiting for values")

        val first = firstDiferred.await()
        val second = secondDeferred.await()

        println("The total is ${first + second}")


    }
}

suspend fun getFirstValue(): Int {
    delay(1000L)
    val value:Int = Random.nextInt(100)
    println("Returning first value $value")
    return value
}

suspend fun getSecondValue(): Int {
    delay(2000L)
    val value:Int = Random.nextInt(1000)
    println("Returning Second value $value")
    return value
}