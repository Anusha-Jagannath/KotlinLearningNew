package jan15

fun main(args: Array<String>) {
    var set = setOf<Int>(1, 2, 3, 4, 5)
    for (data in set) {
        println(data)
    }

    var set2 = hashSetOf<Int>()
    set2.add(1)
    set2.add(2)
    set2.add(3)
    set2.add(4)

    println(set2)
}