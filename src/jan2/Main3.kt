package jan2

fun main(args: Array<String>) {
    println("Learning higher order functions")
    val program = Program4()
    program.addTwoNumbers(2, 3, { x, y -> println(x + y) })
}


class Program4 {


    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {
        action(a, b);
    }
}