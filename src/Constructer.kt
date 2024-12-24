import javax.swing.text.View

fun main(){
    val ward = Student("Rohan", 15, );
    val ward2 = Student("Riha", 10);
    println(ward.name)
    val teacher = Teacher("Savita", "Science", 4)
    println(teacher.studySub)
    println(teacher.period)

}

class Student(val name : String, val rollno : Int, var Class : String, var section : Char){
    init {
        println("Student name = " +name)
        println("Student Roll No. = " +rollno)
        println("Class in which student study = " +Class)
        println("Section of the class = " +section)
    }
    constructor(nameParam : String, rollnoParam : Int) : this(nameParam, rollnoParam, "VI", 'E')
}

class Teacher(nameParam : String, studyParam : String, periodParam : Int){
    val name : String = nameParam
    val studySub : String = studyParam
    val period : Int = periodParam
}