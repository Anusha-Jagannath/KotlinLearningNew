package dec18

fun main(args: Array<String>) {
    println("Learning high level order functions")
    val program = Program()
    program.addTwoNumbers(2, 3, { s: Int -> println(s) })
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        val sum = a + b;
       action(sum)
    }
}

interface MyInterface {

    fun execute(sum: Int)
}