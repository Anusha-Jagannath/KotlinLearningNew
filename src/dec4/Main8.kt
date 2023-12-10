package dec4

import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {
    CustomerData.count
    println(CustomerData.getType())
}

class CustomerData {

    companion object {
        var count = -1;
        fun getType(): String {
            return "indian"
        }
    }


}