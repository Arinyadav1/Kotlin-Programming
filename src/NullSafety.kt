fun main(){

    /*
    "Null Safety" is a language feature that aims to eliminate
    the risk of "NullPointerExceptions" by explicitly differentiating
    between variables that can hold null values (nullable types)
    and those that cannot (non-nullable types)
    */

    var name : String? = null

    println(name?.toUpperCase())

    name.let {
        println("1 $name")
        println("2 $it")
    }

    val NotValueDefine  = name?: "NA"
    println(NotValueDefine)

    val value = name?.toUpperCase()
    println(value)

}

