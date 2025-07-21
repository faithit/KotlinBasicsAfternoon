fun main(){
    println("hello kotlin")
    print("hello")
    println("good afternoon")
    println("this is kotlin")
    //this  is a comment
    /*multiline
    comment
     */
    /* variables are containers for storing a value
    val variablename=value
    var variablename=value
    val used to declare variables that are unchangeable.immutable/readonly
     var used to declare variables thats values will change.mutable
     */
    val fname="edward"
    val age=18
    var course="cybesecurity"
    println(fname)
    println(age)
    println(course)
    course="fullstack"
    println(course)
//displaying variables and strings
    println("hello ny name is "+fname)
    println("i am "+age + " years old")
    //string interpolation
    println("hello my name is $fname and i am $age years old")
    //calling a function
    greetings()

}
fun greetings(){
    println("hello good afternoon")
}
