package jan2

fun main(args: Array<String>) {
    println("learning higher order functions classes")
    addTwoNumbers(2,3, {x, y -> println(x+y)})
}


fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {
    action(a, b);
}