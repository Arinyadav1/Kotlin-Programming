fun main(args : Array<String>){
    print(A1.name)
    B1.print()
}

object A1{
    val name = "Myself Priyanka"
}

object B1{
    val country = "India"

    fun print(){
        println(" i live in $country")
    }
}