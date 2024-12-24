fun main(){

    /*
     A for loop is used to iterate over a collection of items, such
     as a list, array, or range. It allows you to execute a block of
     code for each element in the collection.
     */

    //draw Diamond
    for (i in 1 .. 5){
        for (k in 5 downTo i) {
            print(" ")
        }
        for (j in 1..i) {
            print("* ")
        }
        println("")
    }
    for (i in 4 downTo 1){
        for (k in 1 .. 5-i) {
            print(" ")
        }
        for (j in 1..i) {
            print(" *")
        }
        println("")
    }


    for(i in 1 ..  10){
        println(i)
    }

}