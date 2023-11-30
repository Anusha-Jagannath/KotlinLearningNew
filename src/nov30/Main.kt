package nov30


fun main(args: Array<String>) {
    println("Learning inheritance")
    var dog = Dog()
    dog.breed = "iop"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 1
    cat.meow()
    cat.eat()


}


open class Animal {

    open var color: String = ""

    open fun eat() {
        println("Animal is eating")
    }
}

class Dog : Animal() {
    var breed: String = ""

    override var color: String = "yellow"

    fun bark() {
        println("dog is barking")
    }

    override fun eat() {
        super.eat()
        println("Dog is eating")
    }
}

class Cat : Animal() {

    var age: Int = 1

    fun meow() {
        println("cat is talking")
    }

    override fun eat() {
        super.eat()
        println("Cat is eating")
    }
}