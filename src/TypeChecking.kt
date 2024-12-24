fun main(){
    val lion = Lion1()
    val cat = Cat1()
    val penguin = Penguin1()
    val cow = Cow1()


    val array = arrayOf(lion, cow, penguin, cat)

    /* Type checking in Kotlin is the process of verifying that a
    variable or expression is of a certain type. This is done at
    compile time to prevent errors that would occur if the wrong
    type of data was used.*/

    //type checking
    for(obj in array){
        if(obj is Lion1){
           obj.eat()
        } else{
            (obj as Cow1).eat()
        }
    }


}

interface Animalfood1{
    fun foodType()
}

abstract class Animal1 : Animalfood1{
    abstract fun eat()
    abstract fun walk()
}

class Lion1 : Animal1(){
    override fun eat(){
        println("Lion Eat zebra and wildebeest")
    }
    override fun walk(){
        println("Lion walk on four leg")
    }

    override fun foodType() {
        println("Lion is Carnivores")
    }
}

class Penguin1 : Animal1(){
    override fun eat(){
        println("Penguin Eat krill, squids, and fishes")
    }
    override fun walk(){
        println("Penguin walk on Two leg")
    }
    override fun foodType() {
        println("Penguin is Carnivores")
    }
}
class Cow1 : Animal1(){
    override fun eat(){
        println("Cow Eat Grass")
    }
    override fun walk(){
        println("Cow walk on Four leg")
    }
    override fun foodType() {
        println("Cow is Herbivores")
    }
}

class Cat1 : Animalfood1{
    override fun foodType() {
        println("Cat is Omnivores")
    }

}
