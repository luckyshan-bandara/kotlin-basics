package core

val MY_CONSTANT = 100

fun main() {
    val emp = Employee2("Luckyshan")
    emp.fullTime = false
    println(emp.firstName)
    println(emp.fullTime)

    val emp2 = Employee2("Chalani")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee2("Joe", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)
    println(MY_CONSTANT)

    val car1 = Car("Red", "Toyota", 2020)
    println(car1)
    val car2 = Car("Red", "Toyota", 2020)
    println(car1 == car2)
    val car3 = car1.copy()
    println(car3)
    println("ref ${car1 === car3}")
    val car4 = car1.copy(year = 2025)
    println(car4)


    val emp4 = Employee2("Jhon")
    println(emp4)
    val emp5 = Employee2("Jhon")
    println(emp4 == emp5)
}

// 10) Data Classes
data class Car(val color: String, val model: String, val year: Int)

// 8) Getters and setters - custom accessors
class Employee2(val firstName: String, fullTime: Boolean = true){

    var fullTime = fullTime
        get() {
            println("Running the custom get")
            return field
        }
        set(value) {
            println("Running the custom set")
            field = value
        }

}

// 7) No primary constructor, only a secondary constructor
class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}

// 6) Use default values instead of a Secondary constructor
//class Employee2 constructor(val firstName: String, var fullTime: Boolean = true){
//
//}

// 5) Secondary constructor
//class Employee2 constructor(val firstName: String){
//
//    var fullTime: Boolean = true
//
//    constructor(firstName: String, fullTime: Boolean): this(firstName) {
//        this.fullTime = fullTime
//    }
//}

// 4) Use public constructor
//class Employee2 constructor(val firstName: String){
//
//}

// 3) If we want to use access modifiers to constructor - default is public
//class Employee2 constructor(val firstName: String){
//
//}

// 2) Bit simplified way
//class Employee2 constructor(firstName: String){
//
//    val firstName: String = firstName
//}

// 1) Long way
//class Employee2 constructor(firstName: String){
//
//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }
//}