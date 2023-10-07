package oct4

fun main(args: Array<String>) {
    println("Learning variables")
    var name: String
    name = "Steve"
    var person = Person()
    person.display(person.name)
}

class Person {

    var name: String = ""

    fun display(name: String) {
        println(name)
    }
}