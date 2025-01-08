package core

fun main() {
    val emp = Employee2("Luckyshan")
    println(emp.firstName)

    val emp2 = Employee2("Chalani")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee2("Joe", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)
}

// 7) No primary constructor, only a secondary constructor
class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}

// 6) Use default values instead of a Secondary constructor
class Employee2 constructor(val firstName: String, var fullTime: Boolean = true){

}

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