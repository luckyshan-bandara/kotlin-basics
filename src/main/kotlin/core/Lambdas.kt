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

    println("------------------------------------------------------------------------------------------------------------")

    println(countTo100())

    println("------------------------------------------------------------------------------------------------------------")

    println(countTo1002())

    findByLastName(employees, "Shan")
    findByLastName(employees, "Shanz")

    // nested lambdas - nested apply
    "Some String".apply somestring@{
        "Another String".apply {
            println(lowercase())
            println(this@somestring.uppercase())
        }
    }
}

fun topLevel2() = println("I'm in a function")

// 1.1 fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

// 1.2 lambdas 'with Receivers'
fun countTo100() =
     with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

// 2 lambdas 'apply'
fun countTo1002() =
    StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

// 3.1
//fun findByLastName(employees: List<Employee4>, lastName: String) {
//    for (emp in employees) {
//        if (emp.lname == lastName) {
//            println("Yes, there's an employee with last name $lastName")
//            return
//        }
//    }
//    println("No, there's no employee with last name $lastName")
//}

// 3.2 lambda version
fun findByLastName(employees: List<Employee4>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lname == lastName) {
            println("Yes, there's an employee with last name $lastName")
//            return // returns from labmda and function
            return@returnBlock // local return
        }
    }
    println("No, there's no employee with last name $lastName")
}

data class Employee4(val fname: String, val lname: String, val startYear: Int)