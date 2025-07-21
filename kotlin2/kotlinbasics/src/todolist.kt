fun main(){
    var tasks= arrayOf<String>()
    while(true){
        println("To do list menu")
        println("1.Add TASK")
        println("2.VIEW TASKS")
        println("3.DELETE  TASK")
        println("4.EXIT")
        print("choose an option:")

        when(readLine()?.toIntOrNull()){
            1 ->{
                print("enter a new task")
                val task=readLine()?:""
                tasks+=task //append to array
                println("Task ADDED!")
            }
            2 ->{
                println("Your Tasks")
                tasks.forEachIndexed{index,task ->
                    println("${index+1}.$task")
                }
            }
            4->{
                print("goodbye")
                return
            }
            else->println("invalid option!")
        }

    }
}