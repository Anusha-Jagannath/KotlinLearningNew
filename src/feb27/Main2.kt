package feb27

import feb20.Person
import oct29.add

fun main(args: Array<String>) {

    println("Learning scope functions")
    val person = Person().apply {
        name = "jkl"
        age = 23
    }

    val numbersList = mutableListOf<Int>()
    val num1 = numbersList.also {
        it.add(1)
        it.add(2)
    }
    println(num1)



}