package coroutines

import kotlin.concurrent.thread


fun main(args: Array<String>) {
    println("Learning coroutines")
    println("Main program starts: ${Thread.currentThread().name}")

    thread {
        println("The fake work starts here ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("The fake work ends here ${Thread.currentThread().name}")
    }

    println("Main program ends: ${Thread.currentThread().name}")

    println("Main activity start here: ${Thread.currentThread().name}")

   thread{
        println("The fake work starts here ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("The main program ends here ${Thread.currentThread().name}")
    }
    println("Main program ends here: ${Thread.currentThread().name}")






}