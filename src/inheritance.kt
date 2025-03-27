//Parent class/Base class/Super class
open class Animal{
    var age = 12
    var gender = "Male"

    fun makeSound(){
        println("Animal is speaking")
    }

}
//Child class/Derived class/Sub class
open class dog:Animal(){
    fun bark(){
        println("Dog is woofing")
    }

}

class cat:dog(){
    fun meow(){
        println("Cat is meowing")
    }

}

fun main(){
    var a = Animal()

    var d = dog()
  d.makeSound()
    var c = cat()



}