fun main(){
    val rectangle = Rectangle(4.0,5.0)
    rectangle.display()
    println(rectangle.area())
    rectangle.print()


}

/*
Abstraction, in the context of OOP, refers to the ability to
hide complex implementation details and show only the necessary
features of an object
*/

abstract class Form{
    lateinit var name : String
    abstract fun area() : Double
     fun display(){
        println("Area of Circle")
    }
}

class Rectangle(private val length : Double, private val width : Double) : Form(){
    override fun area(): Double {
        return length * width
    }
//    override lateinit var name : Int

     fun print(){
         super.display()
     }
}