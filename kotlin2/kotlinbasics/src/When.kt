fun main() {
    print("enter your marks:")
    val marks = readLine()?.toIntOrNull()
    if (marks != null && marks in 0..100) {
        when {
            marks >= 90 -> println("grade A")
            marks >= 80 -> println("grade B")
            marks >= 70 -> println("grade C")
            marks >= 60 -> println("grade D")
            else -> println("fail")
        }
    } else {
        println("invalid input!enter a number btwn 0 and 100")
    }
    //write a program that asks user to enter a number
    //(1-7) and prints the corresponding day of week
    println("enter  a number  to display  day of week")
    var number=readLine()?.toIntOrNull()
    when(number){
        1->println("monday")
        2->println("Tuesday")
        3->println("wedsday")
        4->println("thursday")
        5->println("friday")
        6->println("saturday")
        7->println("sunday")
        else->println("enter a number btwn 1 and 7")
    }

    /*write a program that asks the user  for their age
    and determines the movie ticket price based on  age
    ( hint :age in 5...12 ->500)
    below 5 years:free
    5-12 years:500ksh
    13-60:1000
    above 60:700
     */
println("what is your age?")
    var age= readLine()?.toIntOrNull()
    if(age!=null && age in 1..100){

        when{
            age<=5 -> println("free ticket")
            age in 5..12 -> println("Ticket price 500ksh")
            age in 13..60 ->println("Ticket price is 1000ksh")
            age>60 -> println("Ticket prize is 700 ksh")
            else ->println("invalid input")
        }
    }else
        println("age to be btwn 1 and 100")
}