package dec18

fun main(args: Array<String>) {
    println("Learning sealed classes")

    var shape = Shape1.Circle(12);
    checkShape(shape)
}

sealed class Shape1 {

    class Circle(var radius: Int) : Shape1()

    class Square(var side: Int) : Shape1()

    class Rectangle(var length: Int, var breadth: Int) : Shape1()
}


fun checkShape(shape1: Shape1) {

    when (shape1) {
        is Shape1.Circle -> println("area is ${shape1.radius * shape1.radius}")
        is Shape1.Square -> println("area is ${shape1.side * shape1.side}")
        is Shape1.Rectangle -> println("area is ${shape1.length * shape1.breadth}")
    }
}