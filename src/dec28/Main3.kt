package dec28

import dec18.checkShape

fun main(args: Array<String>) {

    println("Learning sealed classes")
    var circle = Shape.Circle(3f);

    checkShape(circle)

}

sealed class Shape {

    class Circle(var radius: Float) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
    class Square(var side: Float) : Shape()
}


fun checkShape(shape: Shape) {

    when (shape) {
        is Shape.Circle -> println("shape is ${shape.radius * shape.radius}")
        is Shape.Square -> println("shape is ${shape.side * shape.side}")
        is Shape.Rectangle -> println("shape  is ${shape.length * shape.breadth}")
    }
}