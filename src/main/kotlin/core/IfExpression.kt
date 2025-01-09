package core

fun main() {

    val someCondition = 69 > 22
    var num = if (someCondition) 50 else 60

    val num2 = if (someCondition) {
        println("true here")
        50
    } else {
        println("false here")
        60
    }

    println(num)
    println(num2)

    println("The result of the expression is: ${if (someCondition) {
        println("true here")
        50
    } else {
        println("false here")
        60
    }}")

    val x = if (someCondition) {
        println("something")
    } else {
        println("something else")
    }
    println(x.javaClass)
}