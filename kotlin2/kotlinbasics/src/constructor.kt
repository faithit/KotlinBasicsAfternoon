class student(val  name:String,val age:Int,val course:String )//CONSTRUCTOR
{
    fun displayinfo(){
        println("name: $name age: $age course: $course ")
}
}

fun main(){
    //creating  object
    val student1=student("oliver",20,"dataanalytics")
//another object
    val student2=student("lucy",16,"mit")
    println("the student name is ${student1.name}")
    //calling the displayinfo
    student1.displayinfo()
    student2.displayinfo()
}