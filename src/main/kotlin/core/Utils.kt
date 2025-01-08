package core

import java.util.*

class Utils {

    fun upperFirstAndLast(str: String): String {
        val upperFrst = str.substring(0,1).uppercase() + str.substring(1)
        return upperFrst.substring(0, upperFrst.length-1) + upperFrst.substring(upperFrst.length-1, upperFrst.length).uppercase()
    }

}