package core.inheritance

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
open class Something {

    val someProperty: String

    constructor(someParamater: String) {
        someProperty = someParamater
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {

    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }

}

// data classes? Modifier 'open' is incompatible with 'data'
//open data class DataClass(val number: Int)