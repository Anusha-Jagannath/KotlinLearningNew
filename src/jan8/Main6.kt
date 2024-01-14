package jan8

fun main(args: Array<String>) {
    println("Learning maps and hashmaps")

    val map = mapOf<String, String>("1" to "one", "2" to "two", "3" to "three")
    println(map)

    val map2 = hashMapOf<String, String>()
    map2.put("1", "one")
    map2.put("2", "two")
    map2.put("3", "three")
}