package core

fun main() {

    val strings = listOf("spring", "summer", " fall", "summer", " winter")
    val colorList = listOf("black", "white", "green", "white")

    val stringsMutable = mutableListOf("spring", "summer", " fall", "summer", " winter")

    println(strings.last())

    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,55,6)
    println(ints.max())

    println(colorList.zip(strings)) // pair elements - [(black, spring), (white, summer), (green,  fall)]
    println(strings.zip(colorList)) // [(spring, black), (summer, white), ( fall, green)]

    val mergedList = listOf(colorList, strings)
    println(mergedList)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupList = colorList.union(strings)
    println(noDupList)

    val noDupColors = colorList.distinct()
    println(noDupColors)



}