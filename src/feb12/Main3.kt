package feb12

fun main(args: Array<String>) {
    println("Learning strings")
    val name = "iop"
    val s = "Hello $name"

    val rectangle = Rectangle()
    rectangle.length = 2
    rectangle.breadth = 3

    println("The rectangle ${rectangle.length * rectangle.breadth}")
}

class Rectangle {

    var length = 0
    var breadth = 1;
}