package infix

fun main(args: Array<String>) {
    println("Learning objects in kotlin")
    var student = Student("jkl")
    //student.name = "jkl"
    //println("student has got a name ${student.name}")
}

class Student(name: String) {

    var name: String = ""

    init {
        this.name = name
        println("student has got a name as ${name}")
    }
}