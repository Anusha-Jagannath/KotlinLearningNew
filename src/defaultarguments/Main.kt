package defaultarguments

fun main(args: Array<String>) {
    println(findVolume(2, 3))
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int= 10): Int {
    return length * breadth
}