fun main(args : Array<String>){

    //mutable
    val student = mutableMapOf<Int, String>()
    student.put(9052, "Arti")
    student.put(9053, "Ajay")
    student.put(9054, "Arpit")
    student.put(9055, "Ankit")
    student.put(9056, "Ashok")
    student.put(9056, "Ayan")

    student[9052] = "Payal" // add in map
    println(student) // print whole map

    println(student.get(9054)) //print specific key value

    //loop in map
    for((key, value) in student){
        println("$key = $value")
    }


    //immutable

    val map = mapOf<Int, String>(1 to "Hello", 2 to "Wello", 3 to "cello")
    println(map)

}