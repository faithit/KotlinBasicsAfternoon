//array is acollection  of elements
fun  main() {
    val courses = arrayOf("java", "kotlin", "html", "css", "javascript")
//accessing an element
    println(courses[0])
    println(courses[2])
    //modifying an element
    courses[0]="django"
    println(courses[0])
    //getting the size of an array
    println(courses.size)
    //looping through the array
    for(course in courses){
        println(course)
    }
    val products= arrayOf("laptops","chargers","keybords","mouse")
    //forEach function
    products.forEach {product->
        println(product)
    }
    //loop through the array with both the index and  value
    //withIndex()
    for((index,item)in products.withIndex()) {
        println("Item at index $index :$item")
    }
    //forEachIndexed()
    println("foreachindexed")
    products.forEachIndexed { x,y ->
        println("index $x:$y")
    }

}