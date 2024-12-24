fun main(args : Array<String>){
    for(i in 1 until  5){
        SharingWidget.inctwitter()
    }
    for(i in 1 .. 20){
        SharingWidget.incfacebook()
    }
    for(i in 1 .. 545){
        SharingWidget.inclinkedin()
    }

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