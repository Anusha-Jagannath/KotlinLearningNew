package dec11


fun main(args: Array<String>) {


    val creditCardType = CreditCardType2.GOLD

    when (creditCardType) {
        CreditCardType2.GOLD -> println("gold card type ${CreditCardType2.GOLD.message}")
        CreditCardType2.PLATINUM -> println("platinum card type")
        CreditCardType2.SILVER -> println("silver card type")
    }
}

enum class CreditCardType2(val message: String) : ICardCashback {
    GOLD("gold") {
        override fun getCashback() {
            TODO("Not yet implemented")
        }
    },
    PLATINUM("platinum") {
        override fun getCashback() {
            TODO("Not yet implemented")
        }
    },
    SILVER("silver") {
        override fun getCashback() {
            TODO("Not yet implemented")
        }
    }
}

interface ICardCashback {
    fun getCashback()
}