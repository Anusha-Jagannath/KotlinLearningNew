package dec11

fun main(args: Array<String>) {

    println("learning sealed classes")

    val shape = Shape1.Rectangle(10, 20)
    checkShape1(shape)

}

sealed class Shape1 {

    class Rectangle(var length: Int, var breadth: Int) : Shape1()
    class Square(var side: Int) : Shape1()
    class Circle(var radius: Int) : Shape1()
}

private fun checkShape1(shape1: Shape1) {

    when (shape1) {
        is Shape1.Rectangle -> println("Area is ${shape1.length * shape1.breadth}")

        is Shape1.Square -> println("Area is ${shape1.side * shape1.side}")
        is Shape1.Circle -> println("Area is ${shape1.radius * shape1.radius}")
    }
}