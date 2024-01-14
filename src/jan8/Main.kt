package jan8

fun main(args: Array<String>) {
    println("Learning array list")
    var myArray = Array<Int>(5) { 0 }

    for (data in myArray) {
        println(data)
    }

    myArray[0] = 20

    for (data in myArray) {
        println(data)
    }

    for (i in myArray.indices) {
        println(i)
    }
}