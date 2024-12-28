fun main(){
    val num1 = 5

    val factorial = factorialNumber(num1)
    println(factorial)
}

/* A function is a self-contained block of code that performs a
specific task. It can take input parameters and return a value.
*/

fun factorialNumber(num: Int):Int{
    var result = 1

    for (i in 1 .. num){
        result *= i
    }
   return result
}
