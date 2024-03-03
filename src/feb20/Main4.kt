package feb20

fun main(args: Array<String>) {
    println("Learning kotlin scope functions")
    var person = Person()
    person.apply {
        name = "jkl"
        age = 4
    }

    with(person) {
        println(name)
        println(age)
    }
}

class Person {
    var age: Int? = null
    var name: String? = null
}