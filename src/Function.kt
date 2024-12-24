fun main(){
    var num1 = 5;

    var factorial = factorialNumber(num1)
    println(factorial)
}
fun factorialNumber(num: Int):Int{
    var result = 1

    for (i in 1 .. num){
        result *= i
    }
   return result
}


//fun addTwoNumber(a:Int, b:Int):Int{
//    var sum = a + b;
//    return sum
//}