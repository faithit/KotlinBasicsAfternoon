//superclass(parent child)
open class person(val name:String){
    open fun introduce(){
        println("hello my name is $name")
    }
}
//subclass(child class) inheriting from person
class studentb(name:String,val school:String):person(name){
    fun showSchool(){
        println("$name studies at $school")
    }
}
fun main(){
    //creating an object  of studentb
    val student1=studentb("cate","emobilis")
    student1.introduce()//calls introduce() from person
    student1.showSchool() //calls showshoolfrom  studentb
}