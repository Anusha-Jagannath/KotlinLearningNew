package mar5

fun main(args: Array<String>) {

    println("Learning loops")
    var i: Int = 0;

    while (i < 100) {
        if (i % 2 == 0) {
            println(i)
        }
        i++;
    }

    val numbersList = mutableListOf<Int>(1, 2, 3)
    println(numbersList)

    Person().apply {

    }


}

class Person {

    var name: String = ""
    var age: Int = -1
}

