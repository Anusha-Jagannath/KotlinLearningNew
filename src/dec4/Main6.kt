package dec4

fun main(args: Array<String>) {
    println("Learning interface")
}

interface Person1 {
    var name: String

    fun onClick()
}

class Indian1 : Person1 {
    override var name: String = "1"
    override fun onClick() {
        println("onclick")
    }
}