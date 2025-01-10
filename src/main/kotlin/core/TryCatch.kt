package core

fun main() {
//    println(getNumber("22.5") ?: throw IllegalArgumentException("Number isn't an Int"))
    println(getNumber("22.5") ?: "Number isn't an Int")

    notImplementedYet("test-string")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
    }
}

fun notImplementedYet(str: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}