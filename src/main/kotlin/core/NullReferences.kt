package core

fun main() {
    val str: String? = "Not Null here"
    val str4 = str!!.toUpperCase()
    println("What happens? ${str?.toUpperCase()}")

    // Elvis Operator
    val str2: String = str ?: "This is the default value"
    println(str2)

    val something: Any = arrayOf(1,2,3,4)
    val str3 = something as? String
    println(str3)

    println(str3?.toUpperCase())

    println(str4)


    val str5: String? = "This isn't null"
//    printText(str5!!)
    str5?.let { printText(it) }

    val str9: String? = null
    val anotherStr10 = "This isn't nullable"
    println(str9 == anotherStr10)


    val str6 = str5!!
    val str7 = str6.toUpperCase()


    val nullableInts = arrayOfNulls<Int>(5)

    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())
}

fun printText(text: String) {
    println(text)
}