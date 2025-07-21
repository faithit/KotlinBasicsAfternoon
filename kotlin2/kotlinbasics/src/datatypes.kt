import kotlin.math.ln

fun main(){
    //datypes
    //strings
    val lname="jane" //string
    println(lname)
    //numeric datatypes:byte,short,long,int,float,double
    val age:Int=20 //int:whole numberw
    val tax:Double=19.45 //DOUBLE:NUMBERS WITH DECIMAL PLACEs
    val x:Float=12.67f
    println("the tax rate is $tax")
    println("an example of a float value $x")
//boolean :stores true or false
    val isstudent=true
    println(isstudent)
    //char :stores a single character ''
    val grade='A'
    println(grade)
    //typeconversion
    //toDouble(),toFloat().toInt(),toString()
    val y=x.toInt()
    print(y)

}