package core

fun main() {

    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    val r = 5..1 // wrong
    println(5 in backwardRange)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reverseRange = range.reversed()

    for (i in reverseRange) {
        println(i)
    }

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 20 downTo 15) {
        println(i)
    }

    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    println("----------------------------------------------------------------------------------------------")

    val seasons = arrayOf("spring", "summer", "winter", "fall")

    for (s in seasons) {
        println(s)
    }

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    println('e' in str)

    for (index in seasons.indices) {
        println("index $index, value = ${seasons[index]}")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index,value -> println("index $index is $value") }

    for(i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k==7)
                    break@jloop
//                continue@jloop
            }
        }
    }
}