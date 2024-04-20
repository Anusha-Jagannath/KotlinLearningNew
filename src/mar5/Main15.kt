package mar5

fun main(args: Array<String>) {
    println("Learning scope functions")
    val person = Person123()
    with(person) {
        name = "jkl"
        age = 12
    }

    println(person.name)
    println(person.age)

}

//with this
//let it
//run  this


//apply this
//also it

//let
//run
//with

//apply
//also

//let --la it

//run -la
//with -la

//apply --co
//also --co

//let lambda
//apply context
//also context
//run
//with


class Person123 {

    var name: String? = null
    var age: Int? = null
}