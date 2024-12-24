fun main(args: Array<String>){
    MyClass.MyObject.p1()
    
    MyClass.AnotherObject.p2()
}

class MyClass{
    companion object MyObject{
        fun p1(){
            println("I am P1 from MyObject")
        }
    }

    object AnotherObject{
        fun p2(){
            println("I am P2 from AnotherObject")
        }
    }
}