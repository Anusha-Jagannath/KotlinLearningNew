package oct29

fun main(args: Array<String>) {
    println("Learning function sin kotlin")
    findArea(2, 3)
    println(add(2, 3))
}

fun findArea(length: Int, breadth: Int) {
    println("The area is ${length * breadth}")
}

fun add(a: Int, b: Int): Int {
    println("The sum is ${a + b}")
    return a + b;
}