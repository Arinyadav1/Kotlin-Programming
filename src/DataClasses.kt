fun main (agrs : Array<String>){
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

data class Person1(val id : Int, val name : String){

}
