fun main(){
    println("hello from  main function")
    //calling the function
    greet()
    myfunction("mathew",17)
    myfunction("jane",16)
    myfunction("luke",20)
   val sum= addtwonumbers(20,30)
    println("the sum is $sum")
    println(multiply(59,80))
    println(multiply(2,10))
}
//anotherfunction
fun greet(){
    println("hello goodafternoon")
}
//function with a multiple  parameters
fun myfunction(fname:String,age:Int){
    println("hello my name is $fname and i am $age years old ")
}
//function that returns a value
fun addtwonumbers(a:Int,b:Int): Int{
    return a+b
}
//SHORTER SYNTAX FOR RETURN
fun multiply(x:Int,y:Int)=x*y

