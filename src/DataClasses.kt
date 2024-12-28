fun main (){
    val P1 = Person1(1, "Ankit")
    val P2 = Person1(2, "Pankaj")

    println(P1)
    println(P2)
    println(P1.hashCode())
    println(P1 == P2)

    val P3 = P1.copy(3, "Arin")
    println(P3)


    val (id : Int, name : String) = P2
    println(id)
    println(name)

    println(P3.component2())


}

/*
The data class in Kotlin is used to hold the data. This data class contains
some utility functions that are often derivable from the data. With the help
of the data class, you don't need to write the boilerplate code. The compiler
automatically generates all the getter and setter for all the data class properties.
*/

data class Person1(val id : Int, val name : String){

}
