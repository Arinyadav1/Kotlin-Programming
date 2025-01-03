fun main(){
    printAnimal(arrayOf(Lion(), Penguin(), Cow(), Cat()))
}

private fun printAnimal(animals : Array<Animalfood>){
    for(animal in animals){
        animal.foodType()
    }
}

/*
An "interface" is a blueprint defining a set of abstract methods
and properties that a class must implement, essentially acting as a
contract for how a class should behave without providing concrete
implementation details; it allows a class to inherit multiple behaviors
by implementing multiple interfaces.
*/

private interface Animalfood{
     fun foodType()
}


private abstract class Animal : Animalfood{
    abstract fun eat()
    abstract fun walk()
}

private class Lion : Animal(){
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

private class Penguin : Animal(){
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
private class Cow : Animal(){
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

private class Cat : Animalfood{
    override fun foodType() {
        println("Cat is Omnivores")
    }

}
