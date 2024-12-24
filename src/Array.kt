fun main(){

    /* An array is a collection of elements of the same data type stored in contiguous memory locations */

    //define array
    val name = arrayOf("Arin", "Ankit", "Gunjan", "Prince", "Payal")

    //print array with iterator
    for(element in name){
        println(element)
    }

    //print array
    println(name.size)

    //check array condition
    if("Ajay" in name){
        println("Exist")
    }else{
        println("Not Exist")
    }

    //print index and value by for loop iterator
    for((index, value) in name.withIndex()){
        println("$index - $value")
    }

    //print by index
    println(name[3])

    //update array in index 2
    name[2] = "Pankaj"

    //print update array index 2
    println(name[2])





}