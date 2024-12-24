fun main(agrs : Array<String>){
    var name : String? = "Arin Yadav"

    var gender : String? = null
    var age : Int? = null


    if(gender != null){
        println(gender.toUpperCase())
    }
    println(gender?.toUpperCase())


    name?.let {
        println("1 $gender")
        println("2 $it")
    }

    var NotValueDefine  = gender?: "NA"
    println(NotValueDefine)

    var value = gender?.toUpperCase()
    println(value)

}

