package nov4

fun main(args: Array<String>) {
    println("Learning named parameters")
    findVolume(length = 2, breadth = 1)
    findVolume(breadth = 1, length = 2);
}

fun findVolume(length: Int, breadth: Int): Int {
    println("Length $length")
    println("Breadth $breadth")
    return length * breadth;
}