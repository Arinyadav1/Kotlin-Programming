fun main(){
//    println(234.formatingString("Arin"))
    val obj  = User("Arin Yadav")

    obj.formatingString()


}
class User(var name : String){
}

/*
 Kotlin provides the ability to extend a class or an interface
 with new functionality without having to inherit from the class
 or use design patterns such as Decorator.
 */

fun User.formatingString() : String{
    return "----------------\n$this\n----------------"
}
