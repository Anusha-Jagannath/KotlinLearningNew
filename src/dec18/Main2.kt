package dec18


fun main(args: Array<String>) {
    println("Learning sealed classes")
    var circle = Shape.Circle(2f);
    checkShape(circle)
}

sealed class Shape {
    class Circle(var radius: Float) : Shape()
    class Square(var side: Float) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
}

fun checkShape(shape: Shape) {

    when (shape) {
        is Shape.Circle -> println("the radius is ${shape.radius * shape.radius}")
        is Shape.Square -> println("the radius is ${shape.side * shape.side}")
        is Shape.Rectangle -> println("the radius is ${shape.length * shape.breadth}")
    }
}

