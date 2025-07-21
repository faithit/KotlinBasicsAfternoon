//elseif-for ading multiple conditions
fun main() {
    print("enter your marks:")
    val marks= readLine()?.toIntOrNull()
    if(marks!=null && marks in 0..100) {
        if(marks>=90){
            println("GRADE A")
        }else if(marks>=70){
            println("GRADE B")
        }else if(marks>=60){
            println("GRADE C")
        }else if(marks >=50){
            println("GRADE d")
        }else{
            println("FAIL")
        }

    }else{
        print("invalid input!enter a number btwn 0 and 100")
    }


}