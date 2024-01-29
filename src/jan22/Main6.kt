package jan22

fun main(args: Array<String>) {

    val numbersList = mutableListOf<Int>(1, 2, 3)
    println(numbersList)

    val numbersList2 = numbersList.also {
        it.add(4)
        it.add(4)
        it.remove(3)
    }

    println(numbersList)
    println(numbersList2)

    var name: String? = null
    println(name?.length)
    println(name?.reversed())
    val data: Int? = name?.let {
        it.length
    }

    println(data)
}