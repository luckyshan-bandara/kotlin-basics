package core

import core.javacode.DummyClass

fun main() {
    val myInt = 10
    println("Default data type is Int?  ${myInt is Int}")

    var myLong = 22L

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5


    var myDouble = 65.984
    println("Default data type is Double?  ${myDouble is Double}")

    val myFloat = 838.849f
    println("This is a Float?  ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    var char = 'b'
//    var myChar: Char = 65
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true

    val vacationTime = true
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any

}