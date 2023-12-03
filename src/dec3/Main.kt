package dec3

fun main(args: Array<String>) {
    var person = Indian()
}

abstract class Person {


    abstract var name: String
    fun gotoSchool() {

    }

    fun getHeight() {

    }

    abstract fun eat()
}

class Indian : Person() {
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun eat() {
        TODO("Not yet implemented")
    }
}