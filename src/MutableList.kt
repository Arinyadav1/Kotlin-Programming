fun main(args : Array<String>){

    /*
    A "MutableList" in Kotlin is a data structure that represents a
    collection of elements where you can dynamically add, remove, or
    modify existing elements after it's been created, essentially acting
    like a resizable array that allows for flexible manipulation of its
    contents; unlike a standard "List" which is typically immutable
    (read-only). it is similar to LinkedList
*/

    val list : MutableList<Int> = mutableListOf()
    for (i in 1 .. 10){
        list.add(i)
    }

    println(list)
    println("${list.contains(3)} Contains ")
    println("${list[1]} Get")
    println("${list.indexOf(2)} Index")

}