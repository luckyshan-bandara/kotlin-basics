package core

import core.javacode.DummyClass
import java.math.BigDecimal

fun main() {

    val names = arrayOf("John", "Lucky", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    val longs3 = arrayOf(1, 2, 3)

    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    // Initialize with lambda
    val evenNumbers = Array(16) {i -> i*2}

//    for (num in evenNumbers) {
//        println(num)
//    }

    val lotsOfNumbers = Array(100000) {i -> i+1}
    println(lotsOfNumbers[99999])

    val allZeros = Array(100){0}
    println(allZeros[50])

    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4,5)

    for (i in someArray) {
        println(i)
    }

    someArray = Array(6) {i -> (i+1)*10}

    for (i in someArray) {
        println(i)
    }

    val mixArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')

    for (mixElement in mixArray) {
//        println(mixElement)
    }

    println(mixArray.isArrayOf<Any>())

    val myIntArray = intArrayOf(22,8,5,6,9,8,7,4,5,623)
    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    for (num in someOtherArray) {
        println(num)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray: Array<Int> = myIntArray.toTypedArray()

}