package dec4

fun main(args: Array<String>) {
    println("Learning from interface")
}

interface Person22 {

    var name: String

    fun onClick()

    fun onTouch()
}


class Indian2 : Person22 {

    override var name: String = "iop"


    override fun onClick() {
        println("click on button")
    }

    override fun onTouch() {
        println("click on touch")
    }

}
