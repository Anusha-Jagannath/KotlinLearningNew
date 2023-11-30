package nov291

fun main(args: Array<String>) {
    println("Learning inheritance")
    var dog = Dog()
    dog.bark()
    dog.eat()


}

open class Animal {
    var color: String = ""

    open fun eat() {
        println("Animal eating")
    }
}


class Dog : Animal() {

    var breed: String = ""

    fun bark() {
        println("Dog is barking")
    }

    override fun eat() {
        super.eat()
        println("dog is barking")
    }
}

class Cat : Animal() {

    var type: String = ""

    override fun eat() {
        super.eat()
        println("cat is barking")
    }
}