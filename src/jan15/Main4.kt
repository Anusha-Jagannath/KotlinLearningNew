package jan15

fun main(args: Array<String>) {
    println("Learning null pointer exceptions")

    val name: String? = null
    println(name)

    println("The length o fthe name is ${name?.length}")
}