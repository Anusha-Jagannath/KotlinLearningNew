package dec18

fun main(args: Array<String>) {
    println("Learning enum classes")
    val gold = CreditCardType.GOLD
    gold.getCashback()

    when (gold) {
        CreditCardType.SILVER -> println("silver")
        CreditCardType.GOLD -> println("gold")
        CreditCardType.PLATINUM -> println("platinum")
    }
}

enum class CreditCardType : ICashback {
    SILVER {
        override fun getCashback(): Float {
            return 5f
        }
    },
    GOLD {
        override fun getCashback(): Float {
            return 20f
        }
    },
    PLATINUM {
        override fun getCashback(): Float {
            return 10f
        }
    }
}

interface ICashback {

    fun getCashback(): Float
}