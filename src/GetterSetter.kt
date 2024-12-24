fun main(){

    val p1 = Person("Ankit", 21)
    println(p1.name)
    p1.age = 30



}

/*
A "getter" is a function that retrieves the value of a property,
while a "setter" is a function that allows you to modify the
value of a property
*/

class Person(nameParam : String, ageParam : Int){
    var name : String = nameParam
        get() {
            return field.toUpperCase()
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
