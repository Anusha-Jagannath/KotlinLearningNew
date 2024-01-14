package jan8

fun main(args: Array<String>) {
    println("Learning list")
    var list = listOf<String>("yogi", "manmohan", "vajpayee")
    println(list)


    for (i in 0..list.size - 1) {
        println(list[i])
    }

    var list1 = mutableListOf<String>("yoji", "iop")
    list1.add("jkl")
    println(list1)
}