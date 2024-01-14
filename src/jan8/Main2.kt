package jan8

fun main(args: Array<String>) {
    println("Learning array in kotlin")
    val myArray = Array<Int>(5) { 0 }
    myArray[0] = 5
    myArray[1] = 6
    for (element in myArray) {
        println(element)
    }
}