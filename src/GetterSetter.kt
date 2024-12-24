import java.util.*;
fun main(){
//    val obj = Calculator()
//    println(obj.add(6,3))
    val p1 = person("Ankit", 21)
    println(p1.name)
    p1.age = 30



}
class person(nameParam : String, ageParam : Int){
    var name : String = nameParam
        get() {
            return field.toLowerCase()
        }
    var age : Int = ageParam
        set(value) {
            if (value > 0){
                field = value
                println(field)
            }
            else{
                println("Age can't be negative")
            }
        }


}




//class Calculator{
//    lateinit var  name : String
//    fun add(a : Int, b : Int) : Int {
//        return a+b
//    }
//    fun multiple(a : Int, b : Int) : Int {
//        return a*b
//    }
//}