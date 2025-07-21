import kotlin.concurrent.thread

/* while loop-loops  through a block of code
until the condition is false
while(condition){
//block of code to be executed if condition is true
}
 */
fun main(){
    var x=1
    while(x<=5){
        println(x)
        x++
    }
    //countdown timer
    var seconds=10
    while(seconds>0){
        println("TIME LEFT $seconds seconds")
        seconds--
        Thread.sleep(1000)//simulates a delay of i second
    }
    println("Times up!")

    /*o.. while
    do{
    //block of code to be executed if condition is true
    }while(condition)
     */
    var z=10
    do{
        println("the counter is $z")
        z--
    }while(z>= 1)
    //validating pin entry.ensures users enters a 4-digit pin
    var pin:String
    do{
        println("enter a four digit pin:")
        pin= readln()
    }while(pin.length!=4 ||  pin.toIntOrNull()==null)
    println("pin accepted")


}