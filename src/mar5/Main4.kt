package mar5

fun main(args: Array<String>) {
    println("Learning functions")
    println(findArea(2, 3))
    println(addTwoNumbers(2, 5))
}

fun findArea(length: Int, breadth: Int): Int {
    return length * breadth
}

fun addTwoNumbers(a: Int, b: Int): Int {
    return a + b;
}

fun max(a: Int, b: Int): Int {

    if (a > b) return a else return b;
}