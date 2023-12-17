package dec11

fun main(args: Array<String>) {
    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(2)
    var rectangle = Shape.Rectangle(4, 2)
    checkShape(circle)


}

enum class Color {
    RED,
    GREEN,
    BLUE
}

sealed class Shape {

    class Circle(var radius: Float) : Shape()
    class Square(var side: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
}

fun checkShape(shape: Shape) {
    when (shape) {
        is Shape.Circle -> println("Area of circle is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Area of square is ${shape.side * shape.side}")
        is Shape.Rectangle -> println("Area of rectangle is ${shape.length * shape.breadth}")
    }
}
