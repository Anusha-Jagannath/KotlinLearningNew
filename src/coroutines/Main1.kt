package coroutines

import kotlin.concurrent.thread


fun main(args: Array<String>) {
    println("Learning coroutines")
    println("Main program starts here ${Thread.currentThread().name}")


    thread {
        println("The fake work starts here ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("The fake work ends here ${Thread.currentThread().name}")
    }
    Thread.sleep(2000)

    println("Main program ends here ${Thread.currentThread().name}")


}