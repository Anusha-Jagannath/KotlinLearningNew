package nov29

fun main(args: Array<String>) {
    var dog = Dog("black", "iop")

}

open class Animal(var color: String = "") {

    init {
        println("From animal init ${color}")
    }
}


class Dog(color: String, var breed: String) : Animal(color) {

    init {
        println("From dog init ${breed} ${color}")
    }
}