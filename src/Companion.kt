fun main(args: Array<String>){

    MyClass.p1()
    
    MyClass.AnotherObject.p2()
}


/*
A companion object is an object that is declared within a class
using the companion keyword. Unlike regular objects, companion
objects are unique because they allow you to define members that
can be called on the class itself rather than on instances of the class
*/
class MyClass{
    companion object MyObject{
        fun p1(){
            println("I am P1 from MyObject")
        }
    }

    object AnotherObject{
        fun p2(){
            println("I am P2 from AnotherObject")
        }
    }
}