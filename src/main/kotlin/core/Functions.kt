package core

import java.util.*

fun main(args: Array<String>) {
    println(labelMultiply(label = "result", op2 = 2, op1 = 8))

    val emp = Employee3("Jane")
    println(emp.uppercaseFirstname())

    val car1 = Car2("Blue", "Toyota", 2016)
    val car2= Car2("Red", "Nissan", 2020)
    val car3 = Car2("White", "Toyota", 2021)
    printColors(car1, car2, car3)

    val nubers = arrayOf(1,2,3,4,5)

    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)

    for (c in lotsOfCars) {
        println(c)
    }

    val s = "this is all in lowercase"
//    println(Utils().upperFirstAndLast("this is all in lowercase"))
    println(s.upperFirstAndLast())

}

// Extension function
fun String.upperFirstAndLast(): String {
    val upperFrst = substring(0,1).uppercase() + substring(1)
    return upperFrst.substring(0, upperFrst.length-1) + upperFrst.substring(upperFrst.length-1, upperFrst.length).uppercase()
}

// Simplified - function with expression body
fun labelMultiply(op1: Int, op2: Int,
                  label: String = "The answer is:") = "$label ${op1 * op2}"

// Long way - function with block body
//fun labelMultiply(op1: Int, op2: Int, label: String): String {
//    return ("$label ${op1 * op2}")
//}

fun whatever() = 3 * 4

fun printColors(vararg cars: Car2) {
    for (car in cars) {
        println(car.color)
    }
}

class Employee3(val firstName: String) {
    fun uppercaseFirstname() = firstName.uppercase(Locale.getDefault())
}

data class Car2(val color: String, val model: String, val year: Int)
