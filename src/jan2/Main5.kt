package jan2

fun main(args: Array<String>) {
    println("Learning scope functions")
    //let  it
    //apply
    //also  it
    //run
    //with

    var number: Int? = null
    number?.let {
        number = it + 1
    }

    val x: Int? = number?.also {
        it + 1
    }
}