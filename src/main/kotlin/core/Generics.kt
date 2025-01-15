package core

import java.math.BigDecimal

fun main() {

    val list = mutableListOf("Hello", "World")
    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.999), BigDecimal(0.235))

    list.printCollection()
    bdList.printCollection()

}

fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}