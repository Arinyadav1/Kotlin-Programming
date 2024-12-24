fun main (args : Array<String>){
    //it is use for values
    val G1 = Gender.Female
    println(G1)
    println(G1.numOfGenders)

    for(i in Gender.values()){
        println("$i ${i.numOfGenders}")
    }
    G1.printGender()

}

enum class Gender(var numOfGenders : Int){
    Male(24),
    Female(64),
    Other(3);

    fun printGender(){
        println("Gender of $this")
    }
}

//


