package jan2

fun main(args: Array<String>) {
    println("Learning lambda functions")
    val program = Program5()
    val s = "hello"
    program.reverseAndDisplay(s, { x -> println(s.reversed()) })

}


class Program5 {

    fun reverseAndDisplay(str: String, action: (String) -> Unit) {
        action(str)
    }
}
