package functions


fun main(args: Array<String>) {
    println("Find max numbers")
    max(2, 3)
}


fun max(a: Int, b: Int) {
    val a = if (a > b) a else b
    println(a)
}