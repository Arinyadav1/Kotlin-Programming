//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner
fun main() {
//    val read = Scanner(System.`in`)
    var weekDay = "Sunday"
    var result = when (weekDay) {
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