package core

// Sequences are like Java Streams
fun main() {

    val immutableMap = mapOf<Int, Car6>(1 to Car6("green", "Toyota", 2015),
        2 to Car6("red", "Ford", 2016),
        3 to Car6("silver", "Honda", 2013),
        17 to Car6("red", "BMW", 2015),
        8 to Car6("green", "Ford", 2018)
    )

    println(immutableMap.filter { it.value.model == "Ford" }
        .map { it.value.color }) // this creates intermediate instances

    // Sequence does not create intermediate instances
    println(immutableMap.asSequence().filter { it.value.model == "Ford" }
        .map { it.value.color })

    // lazy: nothing happens until we call terminal operator - toList() below
    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .toList()

    println("--------------------------------------------------")

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith('Y') }

    println("--------------------------------------------------")

    listOf("Joe", "Mary", "Jane").asSequence()
        .map { println("mapping $it"); it.uppercase() }
        .filter { println("filtering $it"); it[0] == 'J' }
        .find { it.endsWith('E') }


}

data class Car6(val color: String, val model: String, val year: Int)