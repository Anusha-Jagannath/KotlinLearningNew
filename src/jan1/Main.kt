package jan1

fun main(args: Array<String>) {

    addTwoNumbers(2, 3) { a, b -> println(a + b) }

}


fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {
    action(a, b)
}