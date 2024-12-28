fun main (){

    // use of when condition it is like a switch condition

    /*
    when is a keyword used to create a conditional control flow
    statement, essentially acting as a switch statement in other
    languages like Java,
    */

    val weekDay = "Wednesday"
    val result = when (weekDay) {
        "Monday" -> ("1st Day Of Week")
        "Tuesday" -> ("2nd Day Of Week")
        "Wednesday" -> ("3th Day Of Week")
        "Thusday" -> ("4th Day Of Week")
        "Friday" -> ("5th Day Of Week")
        "Saturday" -> ("6th Day Of Week")
        else -> ("7th Day Of Week")
    }
    println(result)
}