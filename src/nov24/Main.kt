package nov24

import javax.security.auth.login.AccountNotFoundException

fun main(args: Array<String>) {
    println("Learning inheritance")
    var dog = Dog()
    dog.breed = "iop"
    dog.eat()

    var animal = Animal()
    animal.eat()
    animal.color = "iop"
}


open class Animal {
    var color: String = ""
    fun eat() {
        println("eating")
    }
}

class Dog : Animal() {
    var breed: String = ""

    fun bark() {
        println("barking")
    }
}

class Cat : Animal() {
    fun bark() {
        println("Bark")
    }
}

