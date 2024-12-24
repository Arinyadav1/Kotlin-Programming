fun main(args : Array<String>){


    val NastedObj = Outer().Nasted()
    NastedObj.print()
}

class Outer{
    var statement = "I am comes by Inner keyword"
    inner class Nasted{
        fun print(){
            println("I am Nasted Class $statement")
        }
    }
}