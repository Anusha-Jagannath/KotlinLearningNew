package nov30

fun main(args: Array<String>) {
    println("Learning inheritance")
    var dog = Dog1("iop", "black")

}

open class Animal1 {

//    init {
//        println("From dog init ${color}")
//    }

    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From animal init $color")
    }
}

class Dog1 : Animal1 {

//    init {
//        println("From animal init ${breed} $color")
//    }

    var breed: String = ""

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
        println("From dog init $color and $breed")
    }
}