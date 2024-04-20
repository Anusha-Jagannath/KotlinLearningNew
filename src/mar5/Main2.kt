package mar5

fun main(args: Array<String>) {
    println("Learning scope functions")

    var i: Int = 1
    do {
        println(i)
        i++
    } while (i < 100)


    for (i in 1..100) {
        if (i == 5) {
            break
        }

        println(i)
    }

    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
}