/*for loop-loops through a collection
for(item in collection){
//coe to execute the item
}
 */
//loping through a list
fun main() {
    val students = listOf("samuel", "philomena", "mathius", "jane", "mark")
    for (x in students) {
        println(x)
    }
    //loop through an array
    val fruits= arrayOf("kiwi","mangoes","bananas","apples")
    for (fruit in fruits){
        println("my fruits are $fruit")
    }
    //loop through a range  in 2...7
    for(z in 2..7){
        println(z)
    }
    //loop through a range with step
    for (y in 1..10 step 2){
        if (y==5) break
        println("the value of y is :$y")
    }
    //stopping a loop early like when x==5 use break

}//reverse a string using a loop
//check if  a number is prime(use loop and conditionals)
//create a  program that allows  a user to withdraw money
// if they have suffiecient  balance..use conditionals



