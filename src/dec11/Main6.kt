package dec11


fun main(args: Array<String>) {
    println("Learning enum classes")
    val cardType = CreditCardType3.GOLD

    when (cardType) {
        CreditCardType3.GOLD -> println("credit card gold type")
        CreditCardType3.PLATINUM -> println("platinum card type")
        CreditCardType3.SILVER -> println("silver card type")
    }

    val data = CreditCardType3.values()
    data.forEach {
        println(it.color)
    }
}

enum class CreditCardType3(val color: String) : ICardCashback {
    SILVER("silver") {
        override fun getCashback() {
            println("10")
        }
    },
    GOLD("gold") {
        override fun getCashback() {
            println("20")
        }
    },
    PLATINUM("platinum") {
        override fun getCashback() {
            println("30")
        }
    }
}

interface CardCashback {
    fun getCashback(): Float
}