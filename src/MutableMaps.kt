fun main(args : Array<String>){

    /*
    In Kotlin programming, a "MutableMap" is an interface that
    represents a collection of key-value pairs where you can add,
    remove, or modify existing entries. It is similar to HashMap
    */

    //mutable
    // both are similar but return type difference
    val student1 = mutableMapOf<Int, String>() // it returns sequence output
    val student = hashMapOf<Int, String>() // it is not guaranteed returns sequence output
    student.put(9052, "Arti")
    student.put(9053, "Ajay")
    student.put(9054, "Arpit")
    student.put(9055, "Ankit")
    student.put(9056, "Ashok")
    student.put(9056, "Ayan")
    println("$student hashMapOf is not return sequence output") // hashMapOf is not sequence output

    student1.put(9052, "Vijay")
    student1.put(9053, "Kaif")
    student1.put(9054, "Firoj")
    student1.put(9055, "Sameer")
    student1.put(9056, "Mubarik")
    student1.put(9056, "Ashwini")
    println("$student1 mutableMapOf is return sequence output") // mutableMapOf is sequence output



    println(student.get(9054)) //print specific key value

    //loop in map
    for((key, value) in student){
        println("$key = $value")
    }


    //immutable

    val map = mapOf<Int, String>(1 to "Hello", 2 to "Wello", 3 to "cello")
    println(map)

}