package core

fun main() {

    for (num in 5..5000 step 5) {
        println(num)
    }

    println("----------------------------------------------------------------------")

    for (num in -500..0) {
        println(num)
    }

    println("----------------------------------------------------------------------")

    // print first 15 fibonacci sequence
    // 0, 1, 1, 2, 3, 5, 8...
    var num1 = 0
    var num2 = 1
    println(num1)
    println(num2)

    for (i in 1..13) {
        val n = num1 + num2
        println(n)
        num1 = num2
        num2 = n
    }

    println("----------------------------------------------------------------------")

    // 1,11,100,99,98,2
     mainloop@ for (i in 1..5) {
        println(i)
         if (i == 2) {
             break@mainloop
         }
        secondloop@ for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    break@secondloop
                }
            }
        }
    }

    println("----------------------------------------------------------------------")

    var num = 100
    var dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }

    println(dnum)



}