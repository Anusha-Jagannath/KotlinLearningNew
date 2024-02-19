package feb12

fun main(args: Array<String>) {
    var person = Person()
    person.display("jkl")

    person.apply {
        name = "jkl"
        age = 78
    }

    val x = with(person) {
        name = "iop"
        age = 7
        age!! + 5
    }

    val h = person.apply {
        name = "lop"
        age = 7
    }

    println(x)

    println()

    var x1 = with(person) {
        name = "iop"
        age = 5
        age!! + 7
    }
}

class Person {

    var name: String? = null
    var age: Int? = null
    fun display(name: String) {
        println(name)
    }
}


//with //lambda
//let  //lambda
//run  //lambda


//apply //context object
//also  // context object