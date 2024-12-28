fun main(){


    val NestedObj = Outer().Nested()
    NestedObj.print()
}

/*
A nested class is a class that is declared inside another
class. It's a way to logically group classes that are
closely related and to encapsulate code.
*/

class Outer{
    var statement = "I am comes by Inner keyword"
    inner class Nested{
        fun print(){
            println("I am Nested Class $statement")
        }
    }
}