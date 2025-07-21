/* if -specifies a block of code to be executed if
a condition is true
if(condition){
//block of code to be executed if the condition is true
}
 */
fun main(){
val x=5
if (x>=3){
    println("$x is greater than 3")
}
    /*if...else
    if(condition){
    //block of code to be executed if condition is true
    }else{
    //block of code to be executed if the condition is false
    }
    a program that asks user for age then detremines if they
    can vote
    readLine()-reads user input as a  string
    ?.(safe call operator)-prevents operation on null values
    toIntOrNull()-converts  valid numbers to integers but
    returns null for non-numeric input

     */
    println("enter your age:")
     val age =readLine()?.toIntOrNull()
    if(age!=null) {
        if(age>=18){
            println("you are eligible to vote")
        }else{
            println("you cannot vote")
        }
    }else{
        println("invalid input..enter a valid number")
    }
    //login example
    val correctusername="admin"
    val correctpassword="1234"

    println("enter username:")
    val username =readLine()

    println("enter password")
    val password= readLine()

    if(username==correctusername && password==correctpassword){
        println("login successfull!welcome $username")
    }else
    {
        println("invalid username or password")
    }
    /*a program thats user for a number then checks
    if a number is even or odd (num %2==0)

    i
     */


}