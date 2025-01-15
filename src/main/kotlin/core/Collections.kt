package core

fun main() {

    val strings = listOf("spring", "summer", " fall", " winter")
    println(strings.javaClass)

    val empltyList = emptyList<String>()
    println(empltyList.javaClass)

    val stringsNotNull = listOfNotNull("spring", "summer", null, " winter")
    println(stringsNotNull)

    val arraylist = arrayListOf(1,2,4)
    println(arraylist.javaClass)

    val mutablelist = mutableListOf<Int>(1,2,3)
    mutablelist[1] = 20
    println(mutablelist.javaClass)
    println(mutablelist[2])
    println(mutablelist)

    val array = arrayOf("black", "white", "green")
//    val colorList = listOf(*array)
    val colorList = array.toList()
    println(colorList)

    val ints = intArrayOf(1,2,3)
    println(ints.toList())
}