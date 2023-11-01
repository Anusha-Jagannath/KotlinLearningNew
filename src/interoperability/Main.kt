package interoperability

import com.sun.tools.javac.Main

fun main(args: Array<String>) {
    println("Learning interoperability")
    var area = Main2.area(2, 3)
    println("Learning area of rectangle $area")

}

fun add(a: Int, b: Int): Int {
    return a + b
}