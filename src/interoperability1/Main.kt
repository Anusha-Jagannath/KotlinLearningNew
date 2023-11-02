package interoperability1


fun main(args: Array<String>) {
    println("Learning kotlin interoperability")
    val main = Main2().findSum(2, 3)
    System.out.println(main)
}

fun add(a: Int, b: Int): Int {
    return a + b;
}