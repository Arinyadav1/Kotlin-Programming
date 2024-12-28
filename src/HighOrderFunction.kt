import kotlin.math.pow
fun main(args : Array<String>){

    var fn : (a : Double, b : Double) -> Double = ::sum
    println(fn(4.0, 4.0))

    calculator(10.0, 5.0, ::sum)

}

fun sum(a : Double, b : Double) : Double{
    return a + b
}

fun calculator(a : Double, b : Double, gn : (Double, Double) -> Double){
    val result = gn(a, b)
    print(result)
}