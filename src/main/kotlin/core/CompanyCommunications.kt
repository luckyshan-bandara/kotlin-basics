package core

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("This is the string as is")
    val someClass2 = SomeClass.upperToLowerCase("This is the string uppercase", false)
    println(someClass1.someString)
    println(someClass2.someString)

}

// Singleton
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}

// Problem? we cannot access privateVar without instantiating SomeClass - like static in Java
// Solution? companion objects
//class SomeClass {
//    private val privateVar = 6
//
//    fun accessPrivateVar() {
//        println("I'm accessing privateVar: $privateVar")
//    }
//}

// companion objects
// with factory pattern
class SomeClass private constructor(val someString: String) {

    companion object {
        private val privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)

        fun upperToLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }
    }
}