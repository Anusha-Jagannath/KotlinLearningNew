package jan8

fun main(args: Array<String>) {
    println("learning map and hashmaps")
    val map = mapOf<String, String>("1" to "one", "2" to "two", "3" to "three")
    println(map)

    val map2 = hashMapOf<String, String>()
    map2.put("1", "one");
    map2.put("2", "two");
    map2.put("3", "three")
    println(map2)

    for (data in map2) {
        println(data.key + " " + data.value)
    }

}