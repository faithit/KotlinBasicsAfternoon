//lambda its anonymous function
fun main() {
    val greet: (String) -> String = { name -> "hello $name" }

    println(greet("mary"))

    //lambda that adds two numbers
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println(sum(30, 67))
    //lamdbda that multplies two number
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    println(multiply(40, 50))
    //a lambda  function to square  a number
    val square: (Int) -> Int = { num -> num * num }
    println("the square of 3 is ${square(3)}")
    println("the square of 5 is ${square(5)}")
    //lambda that adds three numbers
    val addthreenumbers: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }
    println(addthreenumbers(10, 20, 14))

}