package mar5

fun main(args: Array<String>) {
    println("Learning default arguments")
    println(findVolume(a = 2,   3,  4))
    println(findVolume(a = 2, 3))

}

fun findVolume(a: Int, b: Int, c: Int = 10): Int {
    return a * b * c;
}