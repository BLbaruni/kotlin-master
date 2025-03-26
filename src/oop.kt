class Person {
    var name = "Joe"
    var age = 30
    var location = "Westlands"


    fun speak(){
        println("Doctor is speaking")

    }

}
fun main(){
    var doctor1 = Person()
    doctor1.speak()

    println(doctor1.name)

    var doctor2 = Person()
    doctor2.speak()

    println(doctor2.name)


}