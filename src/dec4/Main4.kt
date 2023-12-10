package dec4

fun main(args: Array<String>) {

    var user1 = User1(1,"jkl")
    var user2 = User1(1,"jkl")
    println(user1 === user2)
    println(user1.equals(user2))
}


data class User1(var id: Int, var name: String)