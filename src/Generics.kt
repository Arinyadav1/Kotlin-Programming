fun main(args : Array<String>){

    val genericDeclaration = Container<String>("Arin Yadav")
    println(genericDeclaration.getValue())

}

/*
Generics allow you to write flexible and reusable code by
parameterizing types. This means you can define classes, interfaces,
and functions that work with a variety of data types while maintaining
type safety
*/

class Container<T>(private var data : T){
    fun setValue(value : T){
        data = value
    }
    fun getValue() : T{
        return data
    }
}

