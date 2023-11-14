package nov13

fun main(args: Array<String>) {
    println("LEarning infix functions")
    val a = 2;
    val b = 4;
    a greater b;

}

infix fun Int.greater(b: Int): Int {
    return if (this > b) this else b;
}