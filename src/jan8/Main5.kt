package jan8

fun main(args: Array<String>) {
    println("Learning map")
    var myMap = mapOf<String, String>("2" to "yogi", "3" to "man", "4" to "jkl")
    println(myMap)

    for (key in myMap) {
        println(key.key + " " + key.value)
    }

    var map = HashMap<String, String>()
    map.put("2", "yogi")
    map.put("3", "jkl")
    

}