package namedparameters

fun main(args: Array<String>) {
    println(findVolume(length = 2, breadth = 3))
    println(findVolume(breadth = 3, length = 2))

}


fun findVolume(length: Int, breadth: Int): Int {
    println("Length is $length")
    println("Breadth is $breadth")
    return length * breadth
}