package oct15

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    println("Work started in ${Thread.currentThread().name}")

    thread {
        println("The current thread is ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("The current thread is ${Thread.currentThread().name}")
    }
    println("The current thread is ${Thread.currentThread().name}")
}