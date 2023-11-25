package inheritance

fun main(args: Array<String>) {
    println("Learning inheritance")

    var dog = Dog()
    dog.color = "iop"
    dog.eat()

}


open class Animal {

    var color: String = ""

    fun eat() {
        println("Eat")
    }
}

class Dog : Animal() {

}