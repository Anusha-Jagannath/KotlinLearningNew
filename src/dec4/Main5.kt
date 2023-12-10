package dec4

fun main(args: Array<String>) {
    println("learning object declaration")
    //var customer = Customer()
    Customer.count = 10
    Customer.typeOfCustomers()

}


object Customer {

    var count: Int = -1
    fun typeOfCustomers(): String {
        return "Indian"
    }
}