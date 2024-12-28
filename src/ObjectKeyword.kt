fun main(){
    print(ObjectOne.name)
    ObjectTwo.print()

    ObjectOne.name = "I am Arin Yadav"

    print(ObjectOne.name)
    ObjectTwo.print()
}

/*
 The object keyword is used to create a singleton object, which is
 a class that has only one instance. This instance is created and
 managed by the Kotlin runtime, ensuring that there is only ever
 one instance of the object in your application.
*/

object ObjectOne{
    var name = "Myself Priyanka"
}

object ObjectTwo{
    val country = "India"

    fun print(){
        println(" i live in $country")
    }
}