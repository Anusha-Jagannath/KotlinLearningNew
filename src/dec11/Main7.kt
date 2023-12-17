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

enum class CreditCard(var color: String) : ICashBack {
    GOLD("gold") {
        override fun getCashBack(): Float {
          return 5f
        }
    },
    SILVER("silver") {
        override fun getCashBack(): Float {
           return 2f
        }
    },
    PLATINUM("platinum") {
        override fun getCashBack(): Float {
            return 10f
        }
    }
}

interface ICashBack {
    fun getCashBack(): Float
}