package nov25

fun main(args: Array<String>) {
    print("Learning inheritance")
    var dog = Dog()
    dog.breed = "uiop"
    dog.bark()

    var cat = Cat()
    cat.legs = 4
    cat.walk()


}

open class Animal {
    var color: String = ""
}

class Dog : Animal() {

    var breed: String = ""

    fun bark() {
        println("barking")
    }
}

class Cat {

    var legs: Int = -1;

    fun walk() {
        println("cat is walking")
    }
}