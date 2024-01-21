package jan15

fun main(args: Array<String>) {
    println("Learning kotlin basics")

    var country = Country()
    country.name = "iop"
}

class Country {
    lateinit var name: String
}