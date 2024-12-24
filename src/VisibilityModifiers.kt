fun main(){
    val c = C()
    c.print()
}
/*
"Visibility Modifiers" refer to keywords like "public", "private", "protected",
and "internal" which define the accessibility or visibility of a class, property,
or function.
*/

public var pub = "Public -> "
internal var inter = "Internal -> "



open class B {
    protected var pro = "Protected -> " //protected is not define outside of class in top level declaration
    private var pri = "Private -> "

    fun privateModifier(){
        println("$pri it is private work only in class")
    }
}

class C : B(){
    fun print(){
        println("$pub it is public use anywhere") /* it is public use anywhere*/
        println("$inter internal modifier it is work within module and act like public modifier") /* internal modifier it is work within module and act like public modifier*/
        println("$pro it is protected use other class and same class") /*it is protected use other class and same class*/
//        println(s) /*it is private work only in class */
        privateModifier()
    }
}




