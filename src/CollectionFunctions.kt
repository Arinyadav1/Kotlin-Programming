fun main(args : Array<String>){

    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list = nums.filter{it % 2 != 0} // filter the value in list
    println(list)

    println(nums.map{it * it}) // convert one form to another form element

    println(nums.forEach { println(it) }) // iterate in all element one by one

    val userList : List<User> = listOf(
        User(1, "A"),
        User(2, "B"),
        User(3, "C"),
        User(4, "D"),
        User(5, "E")
    )

    println(userList.filter { it.id == 2 }) // filter the value in list
    println(userList.map { it.id == 2 }) // convert one form to another form element
    userList.forEach { println(it) } // iterate in all element one by one


    val onlineUser = userList.map{
        OnlineUser(it.id, it.name, "Online")
    }

    println(onlineUser)
}

data class User(val id : Int, val name : String)

data class OnlineUser(val id : Int, val name : String, val type : String)