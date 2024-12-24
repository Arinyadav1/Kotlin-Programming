fun main(){

    /* An ArrayList stores a variable number of objects. This is similar to making
    an array of objects, but with an ArrayList, items can be easily added and removed
    from the ArrayList, and it is resized dynamically */

    val arrayList = arrayListOf<ArrayList<String>>()

    for(i in 1 .. 5){
        arrayList.add(ArrayList())
    }

    arrayList[0].add("grapes")
    arrayList[0].add("Mango")
    arrayList[2].add("papaya")
    arrayList[3].add("orange")
    arrayList[4].add("Mango")

    println(arrayList)

    arrayList.removeAt(1)

    println(arrayList)


}