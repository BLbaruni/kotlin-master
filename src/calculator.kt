import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Calculator!")
    println("Enter the first number: ")
    val num1 = scanner.nextDouble()

    println("Enter the second number: ")
    val num2 = scanner.nextDouble()

    println("Select operation: +, -, *, /")
    val operation = scanner.next()

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Error: Division by zero!")
            return
        }
        else -> {
            println("Invalid operation!")
            return
        }
    }

    println("The result is: $result")
}
