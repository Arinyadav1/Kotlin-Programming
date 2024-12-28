fun main(){

    /*
    Scope functions are a set of functions available in Kotlin
    that allow for concise and convenient operations on objects
    within a specific scope.
    */

    val U1 = UserData()
    U1.age = 10
    U1.name = "Riya"

    U1.apply {
        age = 26
        name = "Ashu"
    }
    println(U1)

    with(U1){
        age = 35
        name = "poonam"
    }
    println(U1)

    U1.let {
        it.age = 19
        it.name = "Arin Yadav"
    }
    println(U1)

    U1.run {
        age = 46
        name = "Mrs. Usha"
    }
    println(U1)

}

data class UserData(var age : Int = 19, var name : String = "Arin")