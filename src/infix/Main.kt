package infix

import nov13.greater

fun main(args: Array<String>) {

    println("Learning infix expression")
    var a = 2;
    var b = 3;
    println(a greater b)
}

fun Int.greaterNumber(b: Int): Int {
    return if (this > b) return this else b
}