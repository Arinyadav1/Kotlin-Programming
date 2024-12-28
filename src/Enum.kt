fun main (){
    //it is use for values
    val G1 = Gender.Female
    println(G1)
    println(G1.numOfGenders)

    for(i in Gender.entries){
        println("$i ${i.numOfGenders}")
    }
    G1.printGender()

}

/*
"Enum" (short for enumeration) is a special type of class that
represents a fixed set of named constants, essentially defining a
collection of distinct values for a specific type, like days of the
week or directions and so on
*/

enum class Gender(var numOfGenders : Int){
    Male(24),
    Female(64),
    Other(3);

    fun printGender(){
        println("Gender of $this")
    }
}



