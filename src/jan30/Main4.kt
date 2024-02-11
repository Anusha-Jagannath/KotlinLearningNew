package jan30

fun main(args: Array<String>) {

    println("Learning comments") //this is a comment
    /*this is another comment*/
    println("this is different comment")

    val person = Person4()
    val x: Person4 = person.apply {
        "yui"
    }

    var ageAfterFiveYears = with(person) {
        name = "iop"
        age = 5
        5
    }

    println(ageAfterFiveYears)


}

class Person4 {

    var name: String? = null
    var age: Int? = null
}