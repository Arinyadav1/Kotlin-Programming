fun main(){
    val obj = RealmePhone()
    obj.company = "Realme"
    obj.modal = "Realme 12 Pro Max"
    obj.price = 30000
    

    obj.allPhoneDetails()
    obj.launchDate()


}

/*
 "Inheritance" is a core object-oriented concept that allows
 a new class (called a subclass or derived class) to inherit
 properties and methods from an existing class
 (called a superclass or base class)
*/

open class Device(){
    var modal : String = ""
    var company : String = ""
    var price : Int = 0
    open fun launchDate(){
        println("10 December 2024")
    }

}

class RealmePhone() : Device(){

    override fun launchDate(){
        println("9 September 2024")
        super.launchDate()
    }

    fun allPhoneDetails(){
        println(modal)
        println(company)
        println(price)

    }
}

