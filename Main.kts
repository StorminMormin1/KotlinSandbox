var balance = 100        // A normal, mutable variable
val name = "Michael"     // An unchangeable or immutable variable
var num1 = 16
var lengthInches = 12.0f
var lengthFeet = 1.5f
val numbers = arrayOf(-3, -1, 1, 2, -5, 4, 3)   // Creates an array of integers

fun main() {
    println("Welcome to Kotlin!\nEnter your name:")

    val username = readLine()!! // Take in user input as a string

    println("Your name is " + username)

    println(numCheck(num1))

    // Passing in parameters of datatype String
    echoString(word = "Apple")
    echoString(word = "Banana")

    println("" + lengthInches + " Inches = " + inchToCM(lengthInches) + " CM")
    println("$lengthFeet feet = ${feetToCM(lengthFeet)} CM")

    val maximum = findMax(numbers = numbers)
    println("The largest number is $maximum")
}

// This is a function that passes in an Int, returns a String
fun  numCheck(num1:Int): String {
    // when logic, works kinda like a switchcase statement
    // value of num1 is on the left, the code that execudes is after the "->"
    when (num1) {
        null -> return "Value is null"
        10 -> return "Value is 10"
        else -> return "Value is " + num1
    }
}

fun echoString(word:String) {
    println("Some word: " + word)
}

fun inchToCM(inLength:Float): Float {
    return inLength * 2.54f
}

fun feetToCM(ftLength:Float): Float {
    return (ftLength * 12f) * 2.54f
}

// Take in a list of numbers, return the largest one
fun findMax(numbers:Array<Int>):Int {
    var max = numbers[0]
    for (number:Int in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

main()
