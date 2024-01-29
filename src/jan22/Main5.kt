package jan22

fun main(args: Array<String>) {
    println("Learning scope functions")
    var person = Person4()

    person.apply {
        name = "iop"
        age = 2
    }

    println(person.name)
    println(person.age)


    var tyu = with(person) {
        name = "iop"
        age = 3
        "iop"
    }

    println(tyu)
}

class Person4 {

    var name: String? = null
    var age: Int? = null
}
//let
//apply
//also
//run
//with  -- this -- result