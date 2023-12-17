package dec11

fun main(args: Array<String>) {
    println("learning enum classes")
    val gold = CreditCard.GOLD

    when (gold) {
        CreditCard.GOLD -> println("gold card type")
        CreditCard.SILVER -> println("silver card type")
        CreditCard.PLATINUM -> println("platinum card type")
    }

    val data = CreditCard.values()
    data.forEach {
        println(it)
    }
}

enum class CreditCard {
    GOLD,
    SILVER,
    PLATINUM
}