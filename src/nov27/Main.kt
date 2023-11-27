package nov27

fun main(args: Array<String>) {
    println("Learning inheritance in kotlin")
    var dog = Dog()
    dog.eat()
    dog.bark()
    println(dog.color)
}

open class Animal {
    open var color: String = ""
    open fun eat() {
        println("Animal eating")
    }
}

class Dog : Animal() {

    var breed: String = ""
    fun bark() {
        println("dog is barking")
    }

    override fun eat() {
        super.eat()
        println("dof is eating")
    }

    override var color: String = "iop"


}

class Cat : Animal() {

    var name: String = ""
    fun walk() {
        println("cat is walking")
    }

    override fun eat() {
        super.eat()
        println("cat is eating")
    }
}