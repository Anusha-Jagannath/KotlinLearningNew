package infix

fun main(args: Array<String>) {
    println("Learning tailrec function")
    println(fib(5))
}


fun fib(n: Int): Int {
    if (n == 0) {
        return 0;
    }

    if (n == 1) {
        return 1;
    }

    return fib(n - 1) + fib(n - 2);
}