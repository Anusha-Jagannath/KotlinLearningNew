package dec4

fun main(args: Array<String>) {

}

abstract class Person {
    abstract var name: String
    fun getHeight() {}

    fun gotoSchool() {}

    abstract fun eat()
}

class Indian : Person() {
    override var name: String = "ippl"

    override fun eat() {
        TODO("Not yet implemented")
    }


}