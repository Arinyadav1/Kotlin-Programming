fun main(args : Array<String>){
    var arr : Array<Int> = arrayOf(1, 2, 3)

    try{
        println(arr[2])
    }
    catch (e : Exception){
        println("The Index Value is not Correct Enter index value in range 0 to 2")
    }
    finally {
        println("I will execute not matter try is ture of false")
    }

}