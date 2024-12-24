fun main(){
    println(rollNo)

    val b  = B()
    val c = C()

    c.q
    c.q
    c.print()
   // b.r it is protected work only subClass
}
public var p = 23
internal var q = 87
private var s = 53
open class B {
    public var p = 23
    internal var q = 87
    protected var r = 67
    private var s = 53
}

class C : B(){
    fun print(){
        println(p) /* it is public use anywhere*/
        println(q) /* internal modifier it is work within module and act like public modifier*/
        println(r) /*it is protected use other class and same class*/
       // println(s) it is private work only in class
    }
}

// By default in kotlin has public access modifiers
class A

fun printName1(name : String){
    println(name)
}

// internal modifier it is work within module and act like public modifier

internal var schoolName = "Indian Era Public School"

// Private modifier work only in file

private val rollNo : Long = 230111009052


