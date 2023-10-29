package oct29

fun main(args: Array<String>) {
    println("Learning kotlin")
    for (i in 1..10) {
        if (i == 5) {
            continue
        }

        if (i % 2 == 0) {
            continue
        }
        println(i)
    }


    myLoop@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 2 && j == 2) {
                continue@myLoop;
            }
            println("$i $j")
        }
    }
}