package mar5

fun main(args: Array<String>) {
    println("Learning functions")
    println(add1(2, 3))

    val name: String? = null
   val x =  name?.let {
        println(it.length)
        println(it.reversed())
    } ?: 1

    println(x)
}

fun add1(a: Int, b: Int): Int {
    return a + b;
}