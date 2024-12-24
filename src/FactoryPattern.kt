fun main(args : Array<String>){
    val burger = Burger.Factory.Create("Turkey Burger")
    println(burger)

}

class Burger(var price : String, var burgerDetails : String){
    object Factory{
        fun Create(burgerType : String) : Burger{
            return when(burgerType){
                "Veggie Burger" -> Burger( "100 Ruppes", "A veggie burger is a hamburger made with a patty that does not contain meat, or the patty of such a hamburger.")
                "Cheese Burger" -> Burger("200 Ruppes", "Cheeseburger. Many would consider the cheeseburger just a variation of the classic beef burger. ")
                "Turkey Burger" -> Burger("150 Ruppes", "Turkey Burger. The turkey sandwich inspired the turkey burger.")
                else -> Burger("60 Ruppes", "Basic Decent Burger")
            }
        }
    }

    override fun toString(): String {
        return "Price of Burger $price Detaile about Burger $burgerDetails"
    }
}


