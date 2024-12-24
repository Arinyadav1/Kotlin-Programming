fun main(){
    val obj = Oneplus("Smartphone")
    obj.company = "OnePlus"
    obj.mod = "Nord SE 3"
    obj.price = 29999

    obj.alldetails()
    obj.price()
    obj.display()
    println(obj.toString())
}
open class Phone(){
    var company : String = ""
    var mod : String = ""
    var price : Int = 0

    open fun alldetails() = println(company +" " +mod +" " +price)
    open fun display() = println("Display of Mobile ")
    open fun price() = println("Price of Phone")
 }

class Oneplus(val typeParam : String) : Phone(){
    override fun alldetails() = println("Oneplus $typeParam all details " +company +" " +mod +" " +price)
    override fun price() = println("Price of " +mod +" " +price)
    override fun display() {
        super.display()
        println("OnePlus Display")
    }

    override fun toString(): String {
        return "Name - $company - Price - $price"
    }
}