fun main(args : Array<String>){
    // it is use for type
    //it cover all cases not use else in when.
    val tiles : Tile = Red("Rose", 34)

    val counts  = when(tiles){
        is Red -> tiles.count*2
        is Blue -> tiles.count*2
    }

    println(counts)

}

sealed class Tile
class Red(val type : String, val count : Int) : Tile()
class Blue(val type : String, val count : Int) : Tile()
