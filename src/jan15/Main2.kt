package jan15

fun main(args: Array<String>) {
    println("Learning filter and map")
    val myNumbers = listOf<Int>(2, 3, 4, 6, 23, 90);
    val mySmallNums = myNumbers.filter { x -> x < 10 }
    println(mySmallNums)

    val mySquaredNumbers = myNumbers.map { num -> num * num }
    println(mySquaredNumbers)

    myNumbers.filter { x -> x < 10 }.map { num -> num * num }
    var people = arrayListOf<Person>()
    people.add(Person(12, "jkl"))
    people.add(Person(13, "iop"))

    var result = people.filter { person -> person.name.contains("i") }
    println(result)
}

class Person(var age: Int, var name: String) {

}