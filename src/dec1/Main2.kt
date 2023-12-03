package dec1

fun main(args: Array<String>) {

    var person = Person1()
    println(person.b)
    println(person.c)
}

open class Person1 {

    private val a = 2;
    val b = 3;
    internal var c = 8;
    protected var d = 10
}

class Test {
    fun testing() {
        var person = Person1()
        println(person.c)
    }
}