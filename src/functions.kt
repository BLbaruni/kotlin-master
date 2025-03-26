import java.awt.event.FocusEvent.Cause

fun main(){
    //Standard library functions/predefined function
    var output = Math.sqrt(81.0)
    println("The squareroot of 81.0 is $output")

    var roundedvalue = Math.round(34.78)
    println(roundedvalue)
    name()
    add()
    employee("John",90000, false)
    employee("Martha",60000, false)

    student("Brian",23,"software engineering")

}

//User defined functions
fun name(){
    println("Glory")
println("")
}

fun add(){
    var x = 20
    var y = 30
    println(x + y)

}
//Parameter and Argument
fun employee(name:String, salary:Int,disability:Boolean) {
    println("$name is earning $salary.Disability : $disability")

}
fun student(name:String, age:Int,course:String) {
    println("$name is earning $age years old.is studying $course")
}