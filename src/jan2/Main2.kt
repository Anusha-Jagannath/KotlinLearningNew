package jan2

fun main(args: Array<String>) {
    println("Learning higher order functions")
    val program = Program()
    program.addTwoNumber(2, 3)
    program.addTwoNumbers2(2, 3, object : MyInterface {
        override fun action(sum: Int) {
            println(sum)
        }
    })

    program.addToNumbers(2, 3) { sum -> println(sum) }

}

class Program {
    fun addTwoNumber(a: Int, b: Int) {
        val sum = a + b;
        println(sum)
    }

    fun addTwoNumbers2(a: Int, b: Int, action: MyInterface) {
        action.action(a + b)
    }


    fun addToNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        val sum = a + b;
        action(sum)
    }
}

interface MyInterface {

    fun action(sum: Int)
}