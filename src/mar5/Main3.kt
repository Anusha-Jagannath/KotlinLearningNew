package mar5

fun main(args: Array<String>) {

    for (i in 1..10) {
        if (i == 5) continue
        println(i)
    }


    for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
        }
    }
}