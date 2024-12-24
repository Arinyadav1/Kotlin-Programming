fun main(){
    var rectangle = Rectangle(4.0,5.0)
    rectangle.display()
    println(rectangle.area())
    rectangle.print()

}

abstract class Form{
    lateinit var name : String
    abstract fun area() : Double
     fun display(){
        println("Area of Circle")
    }
}

class Rectangle(val length : Double, val width : Double) : Form(){
    override fun area(): Double {
        return length * width
    }
//    override lateinit var name : Int

     fun print(){
         super.display()
     }
}