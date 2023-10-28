package dowhile

fun main(args: Array<String>) {
    
    var i =0;
    do {
      if (i%2 == 0) {
          println(i)
      }
        i++;
    } while (i<=10)
}