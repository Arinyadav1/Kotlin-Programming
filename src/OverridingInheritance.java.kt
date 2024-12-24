fun main(){
    val obj = OnePlus("Smartphone")
    obj.company = "OnePlus"
    obj.mod = "Nord SE 3"
    obj.price = 29999

    obj.allDetails()
    obj.price()
    obj.display()
    println(obj.toString())
}

/*
Overriding inheritance allows a subclass (derived class) to
provide a specific implementation of a method or property
that is already defined in its superclass (base class).
*/

open class Phone{
    var company : String = ""
    var mod : String = ""
    var price : Int = 0

    open fun allDetails() = println("$company $mod $price")
    open fun display() = println("Display of Mobile ")
    open fun price() = println("Price of Phone")
 }

class OnePlus(val typeParam : String) : Phone(){
    override fun allDetails() = println("$typeParam all details $company $mod Rs.$price")
    override fun price() = println("Price of $mod Rs.$price")
    override fun display() {
        super.display()
        println("OnePlus Display")
    }

    override fun toString(): String {
        return "Name - $company - Price - Rs.$price"
    }
}