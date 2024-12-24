fun main(args : Array<String>){
    createUserList(50)
    createUserList(-1)

}

fun createUserList(count : Int){
    if(count < 0){
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("The List of User is $count")
    }
}