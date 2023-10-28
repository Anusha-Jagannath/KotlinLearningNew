package whileLoops

fun main(args: Array<String>) {
    println("Learning break statements")
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }

    myLoop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 3 && j == 3) {
                break@myLoop;
            }
            println("$i $j")
        }
    }
}