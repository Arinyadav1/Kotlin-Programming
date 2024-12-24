fun main(args : Array<String>){
//    println(234.formatingString("Arin"))
    val obj  = user("Arin Yadav")
    val age : Int = 20
    obj.formatingString()


}
class user(var name : String){

}




fun user.formatingString() : String{
    return "----------------\n$this\n----------------"
}