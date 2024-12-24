fun main(){
    val lion = Lion2()
    val cat = Cat2()

    val arr : Array<AnimalFood> = arrayOf(lion, cat)

    /*
    Kotlin's compiler performs automatic type checks and
    casts when possible. This eliminates the need for
    explicit casting in many cases.
    */
    for(obj in arr){
        if(obj is Lion2){
            obj.eat()
        } else {
            (obj as Cat2).catName()
        }
    }
}

interface AnimalFood{
    fun foodType()
}

abstract class Animal2 : AnimalFood{
    abstract fun eat()
    abstract fun walk()
}

class Lion2 : Animal2(){
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

class Cat2 : AnimalFood{
    override fun foodType() {
        println("Cat is Omnivores")
    }

    fun catName(){
        println("Kitty")
    }

}
