package controlstatements

fun main(args: Array<String>) {
    println("Learning expressions")

    val x = 2
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        0, 1 -> println("x is 0 or 1")
        else -> println("x value is unknown")
    }
}