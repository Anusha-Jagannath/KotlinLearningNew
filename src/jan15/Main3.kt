package jan15


fun main(args: Array<String>) {
    println("Learning filter and predicates")

    val myNumbers = listOf<Int>(2, 3, 4, 6)
    val check1 = myNumbers.all { it > 10 }
    println(check1)

    val check2 = myNumbers.any { it > 10 }
    println(check2)

    val totalCount = myNumbers.count { it > 10 }
    println(totalCount)

}