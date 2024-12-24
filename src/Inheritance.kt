fun main(){
    val obj = RealmePhone("Arin")
    obj.company = "Realme"
    obj.modal = "Realme 12 Pro Max"
    obj.price = 30000

    obj.allPhoneDetails()
    obj.launchDate()
}

open class Device(){
    var modal : String = ""
    var company : String = ""
    var price : Int = 0
    open fun launchDate(){
        println("10 December 2024")
    }

}

class RealmePhone(val type : String) : Device(){

    override fun launchDate(){
        println("9 Septeber 2024")
        super.launchDate()
    }

    fun allPhoneDetails(){
        println(modal)
        println(company)
        println(price)
    }
}

