package dec11


fun main(args: Array<String>) {

    val silver = CreditCardType.SILVER
    println(silver.ordinal)

    val types = CreditCardType.values()
    types.forEach {
        println(it)
    }

    when (silver) {
        CreditCardType.GOLD -> println("gold type card")
        CreditCardType.SILVER -> println("silver type card")
        CreditCardType.PLATINUM -> println("platinum type card")
        else -> {}
    }
    println(silver.color)
}

enum class CreditCardType(val color: String): CashBack {
    SILVER("white") {
        override fun getCashback(): Float {
           return 2f
        }
    },
    GOLD("gold") {
        override fun getCashback(): Float {
            return 1f
        }
    },
    PLATINUM("pla") {
        override fun getCashback(): Float {
            return 3f
        }
    }
}

interface CashBack {
    fun getCashback(): Float
}
