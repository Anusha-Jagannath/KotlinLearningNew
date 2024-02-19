package feb12

fun main(args: Array<String>) {
    println("Learning kotlin")
    val name: String? = null
    name?.let {
        println(it.length)
        println(it.lowercase())
    }
}