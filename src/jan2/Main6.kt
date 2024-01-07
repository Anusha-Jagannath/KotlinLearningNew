package jan2

fun main(args: Array<String>) {
    println("Learning scope functions")
    var person = Person()
    person.apply {
        person.name = "iop"
        person.age = 9
    }


    with(person) {
         this.name = "iop"
         this.age = 9
     }
}

class Person {
    var name: String = ""
    var age: Int = -1
}