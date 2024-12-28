
fun main(){
    val ward = Student("Rohan", 15, )
    val ward2 = Student("Riha", 10)
    println(ward.name)
    println(ward2.name)

    val teacher = Teacher("Savita", "Science", 4)
    println(teacher.studySub)
    println(teacher.period)
}

/*
A companion object is an object that is declared within a class using the
companion keyword. Unlike regular objects, companion objects are unique because
they allow you to define members that can be called on the class itself rather
than on instances of the class
*/

class Student( val name : String,  rollno : Int, Class : String, section : Char){
    init {
        println("Student name = $name")
        println("Student Roll No. = $rollno")
        println("Class in which student study = $Class")
        println("Section of the class = $section")
    }
    constructor(nameParam : String, rollnoParam : Int) : this(nameParam, rollnoParam, "VI", 'E')
}

class Teacher(nameParam : String, studyParam : String, periodParam : Int){
    val name : String = nameParam
    val studySub : String = studyParam
    val period : Int = periodParam
}