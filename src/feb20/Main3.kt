package feb20

fun main(args: Array<String>) {
    println("Learning ranges in kotlin")
    var r1 = 1..5
    println(r1)

    var r2 = 5 downTo 1
    println(r2)

    var r3 = 5 downTo 1 step 2
    println(r3)

    var r4 = 'a'..'z'
    println(r4)
}