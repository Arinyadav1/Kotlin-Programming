fun main(args : Array<String>){
    val list : MutableList<Int> = mutableListOf()
    for (i in 1 .. 10){
        list.add(i)
    }
    println("${list.contains(3)} Contains ")
    println("${list.get(1)} Get")
    println("${list.indexOf(2)} Index")

    println(list)

    val list2 = listOf(11, 12, 13, 14, 15)
    list.addAll(list2)
    println(list)
    
}