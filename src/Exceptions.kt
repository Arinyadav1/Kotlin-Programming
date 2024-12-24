fun main(args : Array<String>){
    val arr : Array<Int> = arrayOf(1, 2, 3)

    /*
    An "Exception" refers to an unexpected event that occurs during
    program execution, disrupting the normal flow of instructions and
    signaling an error that needs to be handled to prevent the program
    from crashing
    */

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