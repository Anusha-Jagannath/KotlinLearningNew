package jan30

fun main(args: Array<String>) {

    val numbersList = arrayListOf<Int>(1, 2, 3)
    numbersList.also {
        it.add(4)
        it.add(5)
        it.remove(4)
    }

    println(numbersList)
}

class Person {
    var name: String = ""
    var id: Int = -1

}