package core

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val emp1 = Employee("Kamal", 45)
    val emp2 = Employee("Kamal", 45)

    println(emp1)

    val change = 4.22

    println("change = $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("ans = ${numerator/denominator}")

    val name = "namezz"
    val filePath = """
        *................................................
            *C:\Projects\learn-kotlin
            *new line
            *lucky
            *$name
            *..............................................................
        """.trimMargin("*")
    println(filePath)

    println("emp1 and emp2 referentially equals? ${emp1 === emp2}")
    println("emp1 and emp2 structurally equals? ${emp1 == emp2}")


}

data class Employee(var name: String, val id: Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }

}