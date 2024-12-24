import kotlin.math.pow

fun main(args : Array<String>){
    add(3.0, 5.0)
    power(3.0, 5.0)

    var fn : (a : Double, b : Double) -> Double = ::add
    println(fn(4.0, 4.0))

    var fn1 : (a : Double, b : Double) -> Double = ::power
    println(fn1(4.0, 4.0))
}

fun add(a : Double, b : Double) : Double{
    return a + b
}

fun power(a : Double, b : Double) : Double{
    return a.pow(b)
}