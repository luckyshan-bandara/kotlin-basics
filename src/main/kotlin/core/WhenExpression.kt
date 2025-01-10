package core

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {

    val num = 100

    when(num) {
        100, 600 -> println("600 or 100")
        in 200..250 -> println("in range 200 - 250")
        300 -> println("300")
        else -> println("no match")
    }

    val y = 10

    when(num) {
        y + 80 -> println("90")
        y + 90 -> println("100")
        300 -> println("300")
        else -> println("no match")
    }

    val something: Any = "Lucky"

    when(something) {
        is String -> println(something.uppercase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println("${something - 22}")
    }

    val z = when(something) {
        is String -> {
            println(something.uppercase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {
            println("else -no idea about the Type")
            -1
        }
    }

    println(z)

    val timeOfYear = Season.WINTER
    var num2 = 100

    val str = when (timeOfYear) {
        Season.WINTER -> {
            num2 += 5
            "it's winter"
        }
        Season.SPRING -> "it's spring"
        Season.SUMMER -> "it's summer"
        Season.FALL -> "it's fall"
    }

    println(str)
    println(num2)

    val num3 = 200

    when {
        num2 < num3 -> println("num2 is smaller than num3")
        num2 > num3 -> println("num2 is larger than num3")
        else -> println("equal")
    }


}