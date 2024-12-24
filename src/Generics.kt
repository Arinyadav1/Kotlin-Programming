fun main(args : Array<String>){
    val obj = IntContainer(4)
    println(obj.getValue())
    obj.setValue(5)
    println(obj.getValue())

    val genericDeclaration = Container<Int>(787928)
    println(genericDeclaration.getValue())

}

class Container<T>( var data : T){
    fun setValue(value : T){
        data = value
    }
    fun getValue() : T{
        return data
    }
}

class IntContainer( var data : Int){
    fun setValue(value : Int){
        data = value
    }
    fun getValue() : Int{
        return data
    }
}