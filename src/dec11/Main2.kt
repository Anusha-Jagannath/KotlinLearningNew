package dec11

fun main(args: Array<String>) {
    println("learning enums")
    val type = CreditCardType1.GOLD
    when (type) {
        CreditCardType1.SILVER -> println("silver card type")
        CreditCardType1.GOLD -> println("gold card type")
        CreditCardType1.PLATINUM -> println("platinum card type")

    }
    type.getCashback()
}

enum class CreditCardType1 : ICard {
    SILVER {
        override fun getCashback() {
            println("1")
        }
    },
    GOLD {
        override fun getCashback() {
            println("2")
        }
    },
    PLATINUM {
        override fun getCashback() {
            println("3")
        }
    }
}

interface ICard {
    fun getCashback()
}