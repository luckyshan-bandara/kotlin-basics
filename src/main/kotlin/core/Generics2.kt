package core

fun main() {

    val ints = listOf(1,2,3,4,5)
    val shotrts: List<Short?> = listOf(10,20,30,40)
    val floats: List<Float?> = listOf(100.3f, -459.95f)
    val strings = listOf("1","2","3","4")


    convertToInt2(ints)
    convertToInt2(shotrts)
    convertToInt2(floats)
//    convertToInt(strings)

    append(StringBuilder("string 1 "), StringBuilder("string 2"))

//    printCollection2(shotrts)
    printCollection3(shotrts)
    printCollection2(strings)


    if (strings is List<String>) {
        println("This contains strings")
    }

    var listAny: Any = listOf("str1", "str2")
    if (listAny is List<*>) {
        println("Yes, This contains strings. Thank you star projection!")
    }

//    listAny = listOf(1,2,3)
    if (listAny is List<*>) {
        println("This list contains strings")
        val strList = listAny as List<String>
        println(strList[1].replace("str2", "lucky str1"))
    }

}

// more than one interface implemented with 'where' clause
fun <T> append(item1: T, item2: T)
    where T: CharSequence, T:Appendable {
        println("Result is ${item1.append(item2)}")
    }

fun <T: Number?> convertToInt2(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}

// accept only non-nullable
fun <T: Any> printCollection2(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

// accept nullable also
fun <T> printCollection3(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}