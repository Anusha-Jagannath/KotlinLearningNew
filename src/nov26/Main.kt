package nov26

fun main(args: Array<String>) {
    println("Learning inheritance")
    val dog = Dog("iop", "black")
    dog.bark()
    dog.eat()
}

open class Animal {

    //var color: String = ""

    open fun eat() {
        println("Animal eating")
    }

    var color: String = ""

    constructor(color: String) {
        this.color = color
    }
}


class Dog : Animal {

    var breed: String = ""

    init {
        println("From animal init $color")
    }

    fun bark() {
        println("dog is barking")
    }


    override fun eat() {
        super<Animal>.eat()
        println("dog is weating")
    }

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
    }
}

open class Cat(color: String) : Animal(color) {

    var legs: Int = -1
    fun walk() {
        println("cat is walking")
    }
}
