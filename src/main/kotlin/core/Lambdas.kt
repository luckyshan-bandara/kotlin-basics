package core

fun main() {
    run { println("Im in a lambda") }

    val employees = listOf(Employee4("John", "Smith", 2013),
        Employee4("Lucky", "Shan", 2022),
        Employee4("Kape", "Town", 2004),
        Employee4("Jason", "Base", 2012)
    )

//    println(employees.minBy { e: Employee4 -> e.startYear })
//    println(employees.minBy { it.startYear })
    println(employees.minBy (Employee4::startYear)) // double colon, member reference

    var num = 10
    run {
        num += 15
        println(num)
    }

    run (::topLevel2)
}

fun topLevel2() = println("I'm in a function")

fun useParameter(employee: List<Employee4>, num: Int) {
    employee.forEach({
        println(it.fname)
        println(num)
    })
}

data class Employee4(val fname: String, val lname: String, val startYear: Int)