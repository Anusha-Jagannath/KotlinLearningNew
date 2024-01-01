package dec28

fun main(args: Array<String>) {
    println("learning higher order functions")
    val program = Program3()
    program.addTwoNumbers3(2, 3, { s: Int -> println(s) })
}

class Program3 {

    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b;
        println(sum)
    }

    fun addTwoNumbers2(a: Int, b: Int, action: IInterface) {
        val sum = a + b;
        action.display(sum);
    }

    fun addTwoNumbers3(a: Int, b: Int, action: (Int) -> Unit) {
        action(a + b);
    }
}

interface IInterface {
    fun display(sum: Int)
}