package jan2

fun main(args: Array<String>) {
    println("Learning scope functions")

    var number: Int? = null

    //let -- it  --Unit
    //apply -- this -- return result
    //also -- it -- return result
    //run -- this  -- Unit
    //with --````````````````````````````````````````````````````

    number?.let {
        number = it + 1
    }

    val person = Person().apply {

    }

    Person().also {

    }

    with(person) {

    }
}

