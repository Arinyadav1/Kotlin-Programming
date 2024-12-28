fun main(){

    /*
    A "Singleton" refers to a design pattern where only one
    instance of a class can exist throughout the entire application,
    providing a global access point to that single instance.
    */

    for(i in 1..<5){
        SharingWidget.inctwitter()
    }
    for(i in 1 .. 20){
        SharingWidget.incfacebook()
    }
    for(i in 1 .. 545){
        SharingWidget.inclinkedin()
    }



    val obj = SharingWidget

    obj.inctwitter()
    obj.inctwitter()
    SharingWidget.displayShare()
}

object SharingWidget{
    private var twitter = 0
    private var facebook = 0
    private var linkedin = 0

    fun inctwitter() = twitter++
    fun incfacebook() = facebook++
    fun inclinkedin() = linkedin++

    fun displayShare() = println("Twitter => $twitter Share | Facebook => $facebook Share | Linkedin => $linkedin Share")
}