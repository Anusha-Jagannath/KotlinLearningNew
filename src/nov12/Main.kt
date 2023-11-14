package nov12

fun main(args: Array<String>) {
    println("Learning infix expressions")

}

fun Int.greater(b: Int): Int {

    return if (this > b) {
        this
    } else {
        b
    }
}