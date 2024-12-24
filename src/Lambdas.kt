fun main(args : Array<String>){

//    var fn : (a : Int, b : Int) -> Int = ::sum1
    calculator1(5,6) { a, b -> a + b }

    val lambdas = {a : Int , b : Int -> a + b}
    val lambdas1 : (Int, Int) -> Int = {a, b -> a+b}

    val sayHi = {a : String -> println(a) }
    val sayHi2 : (String) -> Unit = {a -> println(a) }

    val SingleParam : (Int) -> Int = {x -> x * x}
    val SimplfySingleParam : (Int) -> Int = {it * it}

    //multiline lambdas
    val multiline = {
        println("I am Multiline lambdas")
        val a = 4 + 5
    }

    println(multiline())
}

fun calculator1(a : Int, b : Int, gn : (Int, Int) -> Int){
    val result = gn(a, b)
    println(result)
}