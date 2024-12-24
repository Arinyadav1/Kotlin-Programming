fun main(){
    val lion = Lion1()
    val cat = Cat1()

    if(lion is Lion1){
        println("This is Lion")
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
