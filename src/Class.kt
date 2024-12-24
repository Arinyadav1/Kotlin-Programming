fun main(){
    // the variable hold reference of class called instance
    val Creta = Car("Creta", "Desial", "XUV", "Base Modal", "12 Lakh")
    val Verna = Car("Verna", "Petrol", "Sidan", "TOP Modal", "15 Lakh")
    println( "Creta Price " +Creta.price)
    println( "Verna Price " +Verna.price)
    Creta.allDetails()
    Verna.allDetails()

}

/*
Class is a blueprint for creating objects. It defines a structure
that encapsulates data (properties) and behavior (functions)
*/

class Car(val CarName : String, val engine : String, val design : String, val modal : String, var price : String){

    // the function create within class called member
    fun allDetails(){
        println("$CarName, $engine, $design, $modal, $price")
    }
}


