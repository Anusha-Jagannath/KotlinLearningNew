package mar5

fun main(args: Array<String>) {

    println("Learning kotlin basics")
    val person = Person1()
    person.apply {
        name = "jkl"
        age = 2
    }
}

class Person1 {

    var name: String? = null
    var age: Int? = null
}