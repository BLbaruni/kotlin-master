import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter fisrt number")
    var num = read.nextInt()
    println("Enter second number")
    var num2 = read.nextInt()
    println("Enter third number")
    var num3 = read.nextInt()

    if (num > num2 && num > num3) {
        println("$num is greater")
    } else if (num2 > num && num2 > num3) {
        println("$num2 is greater")
    } else {
        println("$num3 is greater")
    }

}