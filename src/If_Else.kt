fun main(){

    print("Enter the Name = ")
    val personName = readln()
    print("Enter the Age = ")
    val personAge = readln().toInt()

    //The (if-else) statement is used to execute different blocks of code based on a condition.

    //if person age 18 plus then print person is eligible for vote otherwise person is not eligible for vote
    if(personAge >= 18){
      println("$personName is $personAge year old who is eligible for vote ")
    } else {
        println("$personName is $personAge year old who is not eligible for vote ")
    }


}