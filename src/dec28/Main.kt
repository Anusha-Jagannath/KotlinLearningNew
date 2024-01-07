package dec28

fun main(args: Array<String>) {
    println("Learning higher order functions")
    val program = Program()
//    program.addTwoNumbers(2, 3, object : Listeners {
//        override fun action(sum: Int) {
//            println(sum)
//        }
//
//    })

  //  program.addTwoNumbers2(2,3) { sum: Int -> println(sum) }


}


class Program {

    fun addTwoNumbers(a: Int, b: Int, action: Listeners) {
        val sum = a + b;
        println(sum)
    }

    fun addTwoNumbers2(a: Int, b: Int, action: IInterface) {
        val sum = a + b;
        //action(sum)
    }
}

interface Listeners {

    fun action(sum: Int)
}