package jan22

fun main(args: Array<String>) {
    println("Learning scope functions")

    val person = Person()

    with(person) {
        println(this.age)
        println(this.name)
    }
}


//let - to avoid null pointer exception
//apply - this, object
//with - this, result

class Person {
    var name: String = "Sri"
    var age: Int = 20
}