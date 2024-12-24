fun main(){
//    val circle : Shape = Circle(3.0)
//    val square : Shape = Square(4.0)

    val shapes : Array<Shape> = arrayOf(Circle(3.0), Circle(4.0), Square(3.0))
    areaCalculate(shapes)
}

fun areaCalculate(shapes : Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}


/*
Polymorphism is a property through which any message can
be sent to objects of multiple classes, and every object has
the tendency to respond in an appropriate way depending on
the class properties.
*/

open class Shape{
    open fun area() : Double{
        return 0.0
    }
}

class Circle(var radius : Double) : Shape(){
    override fun area() : Double{
        return Math.PI * radius * radius;
    }
}

class Square(var side : Double) : Shape(){
    override fun area() : Double{
        return side * side;
    }
}