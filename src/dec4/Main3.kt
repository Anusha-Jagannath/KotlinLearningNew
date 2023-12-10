package dec4

fun main(args: Array<String>) {
    println("Learning data class")
    val user1 = User(1, "sma")
    val user2 = User(1, "sma")
    println(user1 == user2)
    println(user1.equals(user2))
    val newUser = user1.copy()


}

data class User(val id: Int, val name: String)