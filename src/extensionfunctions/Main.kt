package extensionfunctions

fun main(args: Array<String>) {
    println("Learning extension function")
    var student = Student()
    student.hasPassed(20)
    student.isScholar(56)


    var s1 = "Hello"
    var s2 = "world"
    var s3 = "hjk"
    //s3 = s1 + s2 + s3
    //println(s3)
    println(s1.add(s2, s3))
    val a = 2
    val b = 4
    println(a.greater(4))

}


fun String.add(s2: String, s3: String): String {
    return this + s2 + s3;
}

fun Int.greater(b: Int): Int {
    return if (this > b) {
        this
    } else {
        b
    }
}

class Student {

    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}


fun Student.isScholar(marks: Int): Boolean {
    return marks > 95
}