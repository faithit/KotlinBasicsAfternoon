//a class is a blueprint for creating objects
//class contains properties(variables)and function(methods)

class Person(){
    var name:String=""
    var age:Int=0
    var gender:String=""

    fun intro(){
        println("hello my name is $name and am $age years old")
    }
}
fun main() {
    //an object its an instance of a class
    val person1 = Person()
    person1.name = "jane"
    person1.age = 17
    person1.gender = "female"

    println(person1.name)
    println(person1.age)
    println(person1.gender)
    person1.intro()
//create another object
    val person2 = Person()
    //inititializing the object
    person2.name="mark"
    person2.age=20
    person2.gender="male"

    //calling the intro method
    person2.intro()
    //create a car class:properties model,brand ,year
    //create objebjects
    //displayinfo() method ,speed() method

}