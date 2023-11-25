package nov19

fun main(args: Array<String>) {
    println("Learning secondary constructors")
    var studnet = Student("name", 1);
    println(studnet.id)
    println(studnet.name)
}


class Student1(var name: String) {

    constructor(name: String, id: String) : this(name)
}