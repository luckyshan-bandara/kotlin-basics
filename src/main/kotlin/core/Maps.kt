package core

// Sets cannot have Duplicate Items
fun main() {

    val immutableMap = mapOf<Int, Car3>(1 to Car3("green", "Toyota", 2015),
        2 to Car3("red", "Ford", 2016),
        3 to Car3("silver", "Honda", 2013)
        )

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf<String, Car3>("Jhon's car" to Car3("green", "Toyota", 2015),
        "Lucky's car" to Car3("red", "Ford", 2016))

    println(mutableMap.javaClass)
    println(mutableMap)

    for ((k,v) in mutableMap) {
        println("* $k -> $v")
    }

    val pair = Pair(10, "ten")
    val (first, second) = pair
    println(first)
    println(second)

    val car = Car3("blue", "Alto", 2016)
    // Destructuring
    val (color, model, year) = car
    println("### $color  $model  $year")

    val car2 = Car4("blue", "Alto", 2016)
    val (color2, model2, year2) = car2
    println("### with data class: $color2  $model2  $year2")

    println("--------------------------------------------------------------------")
    val setInts = setOf(10, 15, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(5))

    println(setInts)
    println(setInts.average())
    println(setInts.drop(3)) // drop first 3 elements

    val setIntsMutable = setOf(1,2,3,4,5)
    println(setIntsMutable.plus(10))
    println(setIntsMutable)
}

class Car3(val color: String, val model: String, val year: Int) {

    // for Destructuring
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year

}

data class Car4(val color: String, val model: String, val year: Int) {

}