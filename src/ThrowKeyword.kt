fun main(){
    createUserList(50)
    createUserList(-1)

}

/*
The throw keyword is used to explicitly throw an exception.
This signals that an abnormal condition has occurred during
the program's execution.
*/

fun createUserList(count : Int){
    if(count < 0){
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("The List of User is $count")
    }
}