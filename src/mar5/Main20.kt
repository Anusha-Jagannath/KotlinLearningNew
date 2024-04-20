package mar5

fun main(args: Array<String>) {
    println("Learning kotlin basics")
    display("jkl")
    val person = Person22()
    person.display("jkl")
}

fun display(name: String) {
    println(name)
}

class Person22 {

    fun display(name: String) {
        println(name)
    }
}
