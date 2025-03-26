class Dog(var name:String, var breed:String,var age:Int){

}

fun main(){
    var dog1 = Dog("Brighton","Chihuahua", age = 10)
    println(dog1.name)

    var dog2 = Dog("Jerry","Pitbull", age = 12)
    println(dog2.breed)

    var dog3 = Dog("Tina","Siberian Husky", age = 17)
    println(dog3.age)

    var dog4 = Dog("Perpetual","Siberian Husky", age = 2)
    println(dog4.breed)

}