package jan30

fun main(args: Array<String>) {
    var myString: String = "jkl"
    println(myString)

    var a: Int = 5
    println(a)

    var b: Double = 6.5
    println(b)

    var c: Float = 6.5f
    println(c)

    var name: String = "steve"
    println(name)
    display(name)

    var person = Person1()
    person.name = "iop"
    person.display(person.name)


}

fun display(name: String) {
    println(name)
}

class Person1 {

    var name: String = ""
    fun display(name: String) {
        this.name = name
        println(name)
    }
}