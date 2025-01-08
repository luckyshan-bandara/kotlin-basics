package core.inheritanceandinterface

fun main() {
    val laserPrinter = LaserPrinter("Toshiba", 100)
    laserPrinter.printModel()

    SomethingElse("Whatever")
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name is $modelName")
    abstract fun bestSelingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm:Int): Printer(modelName) {

    final override fun printModel() = println("The model name of Laser printer is $modelName")
    override fun bestSelingPrice() = 129.99

}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {


}

// When no primary constructor
open class Something: MySubInterface {

    val someProperty: String
    override val number: Int = 25
//    override val number2: Int = 50

    constructor(someParamater: String) {
        someProperty = someParamater
        println("I'm in the parent's constructor")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse: Something {

    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }

}

// data classes? Modifier 'open' is incompatible with 'data'
//open data class DataClass(val number: Int)

interface MyInterface {

    val number: Int

    // Property in an interface cannot have a backing field
    val number2: Int
        get() = number * 100

    fun myFunction(str: String): String

}

interface MySubInterface: MyInterface {

    fun mySubFunction(num: Int): String

}