package dec28

fun main(args: Array<String>) {
    println("Learning higher order functions")
    val program = Program4()
    program.addTwoNumbers(2, 3)

    Program4().addTwoNumbers2(2, 3, object : MyInterface {
        override fun action(sum: Int) {
            println(sum)
        }
    })

    program.addTwoNumbers3(2, 3, { sum: Int -> println(sum) })
}

class Program4 {

    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b;
        println(sum)
    }


    fun addTwoNumbers2(a: Int, b: Int, action: MyInterface) {
        val sum = a + b;
        action.action(sum)
    }

    fun addTwoNumbers3(a: Int, b: Int, action: (Int) -> Unit) {
        action(a + b);
    }
}

interface MyInterface {

    fun action(sum: Int)
}