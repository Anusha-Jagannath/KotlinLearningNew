package nov19

fun main(args: Array<String>) {
    println("Learning secondary constructors")
    var student = Student("iop", 10)
    println(student.id)
    println(student.name)

}

class Student(var name: String) {

    var id: Int = -1

    constructor(name: String, id: Int) : this(name) {
        //body
        this.id = id
    }
}