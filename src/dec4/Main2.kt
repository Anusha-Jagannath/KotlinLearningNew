package dec4

fun main(args: Array<String>) {
    var name: String? = null
    println("Learning interface")
    var person = Person2("iop")
    person.onClick()

    name?.let {
        println(name)
    } ?: 2

}

interface MyInterface {

    var name: String

    fun onClick() {}
}

class Person2(override var name: String) : MyInterface {
    override fun onClick() {
        super.onClick()
        println("onclick called")
    }
}