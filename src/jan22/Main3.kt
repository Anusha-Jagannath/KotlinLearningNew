package jan22

fun main(args: Array<String>) {
    println("Learning kotlin")

    //let
    //apply
    //also

    val numbersList = mutableListOf<Int>(1, 2, 3)
    val numbersList2 = numbersList.also {
        it.add(4)
    }

    println(numbersList2)


}

class Person3 {

    var name: String = ""
    var age: Int = 1
}