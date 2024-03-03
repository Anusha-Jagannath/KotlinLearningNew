package feb27

fun main(args: Array<String>) {

    println("Learning scope functions")

    var person = Person()
    person.apply {
        name = "jkl"
        age = 5
    }

    val numbersList = mutableListOf<Int>(1, 2, 3)
    println(numbersList)
    val list = numbersList.apply {
        add(5)
        add(6)
    }

    println(list)
    println(numbersList)
    val name: String? = null
    println(name?.length)
    println(name?.reversed())

}

class Person {
    var name: String? = null
    var age: Int? = null
}