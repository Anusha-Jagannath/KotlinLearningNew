package nov14

fun main(args: Array<String>) {
    val student = Student()
    student.hasPassed(30)
    student.hasGotScholorship(45)

    var s1 = "hello"
    var s2 = "world"
    var s3 = "iop"
    println(s1.concat(s2, s3))
    var a = 2
    var b = 3
    println(a.greater(3))
}

fun String.concat(b: String, c: String): String {
    return this + b + c;
}

class Student {

    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}


fun Student.hasGotScholorship(marks: Int): Boolean {
    return marks > 90
}

fun Int.greater(b: Int): Int {
    return if (this > b) this
    else b
}