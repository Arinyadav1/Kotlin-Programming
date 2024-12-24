fun main(args : Array<String>){

    /*
    A set of built-in functions that allow you to manipulate
    and transform data stored within collections like lists, sets,
    and maps, enabling operations like filtering, mapping, reducing,
    and more, all in a concise and functional style*/

    val numb = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list = numb.filter{it % 2 != 0} // filter the value in list
    println(list)

    println(numb.map{it * it}) // convert one form to another form element

    println(numb.forEach { println(it) }) // iterate in all element one by one

    val userList : List<User1> = listOf(
        User1(1, "A"),
        User1(2, "B"),
        User1(3, "C"),
        User1(4, "D"),
        User1(5, "E")
    )

    println(userList.filter { it.id == 2 }) // filter the value in list
    println(userList.map { it.id == 2 }) // convert one form to another form element
    userList.forEach { println(it) } // iterate in all element one by one


    val onlineUser = userList.map{
        OnlineUser(it.id, it.name, "Online")
    }

    println(onlineUser)
}

data class User1(val id : Int, val name : String)

data class OnlineUser(val id : Int, val name : String, val type : String)