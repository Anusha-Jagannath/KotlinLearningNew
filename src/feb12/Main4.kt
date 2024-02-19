package feb12

fun main(args: Array<String>) {
    println("Learning kotlin basics")
    val name = "sam"
    println(name)
    println("Learning string interpolation $name")
    println("The length of string is ${name.length}")

    var rectangle = Rectangle()
    rectangle.length = 2
    rectangle.breadth = 3

    println("The area is ${rectangle.length * rectangle.breadth}")

    var person = Person5()
    person.apply {
        person.name = "iop"
        person.age = 6
    }

    with(person) {
        this.name = "iop"
        this.age = 7
    }
}


class Rectangle1 {

    var length: Int = 0;
    var breadth: Int = 0;
}

class Person5 {
    var name: String = ""
    var age: Int = 0
}