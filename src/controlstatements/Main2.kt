package controlstatements

fun main(args: Array<String>) {

    println("learning when expression")

    val x = 2
    when (x) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        in 1..20 -> println("x lies in 1 to 20")
        else -> println("default")
    }
}