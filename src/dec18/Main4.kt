package dec18

fun main(args: Array<String>) {
    println("Learning high level functions")
    val program = Program2()
    // val result = program.addTwoNumbers(2, 3)
    //println(result)
    program.addTwoNumbers(2, 3) { x: Int -> println(x) }
}

class Program2 {

//    fun addTwoNumbers(a: Int, b: Int, action: IInterface): Int {
//        val result = a + b;
//        action.printNumbers(result)
//    }

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        val sum = (a + b);
        action(sum)
    }
}

interface IInterface {

    fun printNumbers(result: Int)
}