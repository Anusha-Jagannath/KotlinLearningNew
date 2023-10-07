package oct4

fun main(args: Array<String>) {
    println("Learning variables")
    var name: String = ""
    display(name)
    var person = Person134()
    person.name = "iop"

}

fun display(name: String) {
    println(name)
}

class Person134 {

    var name: String = ""

    fun display() {
        println("The name is $name")
    }
}