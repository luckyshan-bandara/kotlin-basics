package core

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

// Singleton
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}