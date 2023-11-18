package infix

fun main(args: Array<String>) {
    println("Learning classes and objects")
    var student = Student1("jkl")
    println("The name of student is ${student.name}")
}

class Student1(var name: String) {

}