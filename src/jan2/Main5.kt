package jan2

fun main(args: Array<String>) {
    println("Learning scope functions")
    //let  it
    //apply
    //also  it
    //run
    //with


    var i = 3;
    var data = (i * i).also {
        i++
    }

    println(data)
}