package core

import java.math.BigDecimal

fun main() {

    val list = mutableListOf("Hello", "World")
    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.999), BigDecimal(0.235))

    list.printCollection()
    bdList.printCollection()

    val ints = listOf(1,2,3,4,5)
    val shorts: List<Short?> = listOf(12,23,34,54)
    convertToInt(shorts)

}

fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}

// todo: Reified parameters, Covariance, Contravariance, Use-site variance