fun main(args : Array<String>){
    countTime{
        loop(10000000)
    }

}

/*
"Inline Kotlin programming" refers to a feature in the Kotlin
programming language where a function marked as "inline" gets its c
ode directly inserted into the calling code at compile time
*/

inline fun countTime(fn : ()->Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()

    println("Time taken ${end - start} ms")
}

fun loop(n : Long){
    for(i in 1..  n){

    }
}