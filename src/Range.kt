fun main(){

    /*
    A range is a collection of consecutive values defined by a
    starting and ending point. It's a convenient way to represent
    a sequence of elements, especially when iterating over them.
    */

    numberLoop()
}


fun numberLoop(){
    for(i in 1..10){
        checkInRange(i)
    }
}


fun checkInRange(num : Int){
    print("$num number lie in range 1 < until < 5 is ")
    val checkRange = num in 1..5
    println(checkRange)
}