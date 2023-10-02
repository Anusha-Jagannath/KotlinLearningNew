package variables3

fun main(args: Array<String>) {
    println("Learning variables in kotlin")

    var name: String
    name = "Steve"
    display(name)
    var person = Person()
    person.name = "asdfg"
    person.display()
    println("The name of the person is ${person.name}")
}

fun display(name: String) {
    println(name)
}

class Person {
    var name: String = ""
    fun display() {
        println(name)
    }
}