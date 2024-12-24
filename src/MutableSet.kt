fun main(){

    /*
    A "MutableSet" is a collection that stores unique elements
    (no duplicates) and allows you to add or remove elements from
    it after creation. It is similar to HashSet
    */

    val mutableSet = mutableSetOf<Int>() // it returns sequence output
    mutableSet.add(1)
    mutableSet.add(2)
    mutableSet.add(3)
    mutableSet.add(4)
    mutableSet.add(5)
    mutableSet.add(6)
    mutableSet.add(7)

    println(mutableSet)
    for(item in mutableSet){
        println(item)
    }
    println("it returns sequence output")

    val hashset = hashSetOf<Int>() // it is not guaranteed returns sequence output
    hashset.add(1)
    hashset.add(6)
    hashset.add(2)
    hashset.add(5)
    hashset.add(7)
    hashset.add(3)
    hashset.add(4)
    hashset.add(4)
    hashset.add(6)


    println(hashset)
    for(item in hashset){
        println(item)
    }
    println("it is not guaranteed returns sequence output")

}