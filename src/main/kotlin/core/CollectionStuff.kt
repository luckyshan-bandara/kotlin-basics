package core

fun main() {

    val setInts = setOf(10,15,19,5,3,-22)

    println(setInts.filter { it % 2 != 0})

    val immutableMap = mapOf<Int, Car5>(1 to Car5("green", "Toyota", 2015),
        2 to Car5("red", "Ford", 2016),
        3 to Car5("silver", "Honda", 2013),
        17 to Car5("red", "BMW", 2015),
        8 to Car5("green", "Ford", 2018)
    )

    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = mutableMapOf<Int, Car5>(1 to Car5("green", "Toyota", 2015),
        2 to Car5("red", "Ford", 2016),
        3 to Car5("silver", "Honda", 2013)
    )

    println(mutableMap.filter { it.value.color == "green" })

    val ints = arrayOf(1,2,3,4,5)
    val add2list: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add2list.add(i + 10)
    }
    println(add2list)

    val add10List = ints.map { it + 10 }
    println(add10List)
    println(add10List.javaClass)

    println(immutableMap.map { it.value.year })

    println(immutableMap.filter { it.value.model == "Ford" }
        .map { it.value.color })

    println(immutableMap.all { it.value.year > 2014 }) // all should match => false
    println(immutableMap.any { it.value.year > 2014 }) // any match => true
    println(immutableMap.count { it.value.year > 2014 })

    val cars = immutableMap.values
    println(cars.find { it.year > 2014 })
    println(cars.groupBy { it.color })

    println(immutableMap.toSortedMap())
    println(cars.sortedBy { it.year })


}

data class Car5(val color: String, val model: String, val year: Int)