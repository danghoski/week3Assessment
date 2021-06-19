fun main (){

    var count : Int = 0
    for (count in 1..100)
        println(count)
    count = count +1 // count 1 to 100

    when {
        (count % 3 == 0 && count % 5 == 0)
        ->  println("FizzBuzz")
        count % 3 == 0
        -> println("Fizz")
        count % 5 == 0
        -> println("Buzz")
        else
            -> println("$count")
    }

}