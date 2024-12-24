fun main(args : Array<String>){
    countTime{
        loop(10000000)
    }

}

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