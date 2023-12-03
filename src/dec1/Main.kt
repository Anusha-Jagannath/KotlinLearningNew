package dec1

fun main(args: Array<String>) {

}

open class Person {

    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 10
}

class Indian : Person() {

    init {
        println(b)
        println(c)
        println(d)
    }
}