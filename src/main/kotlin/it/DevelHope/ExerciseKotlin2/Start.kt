package it.DevelHope.ExerciseKotlin2

// Declare 3 different variables with number types (e.g. long, double and short), calculate their sum and print it using string templates

fun main(){
    val number1: Short = 123
    val number2 = 4567L
    val number3 = 89.10f
    val sum = number1 + number2 + number3

    println("The sum of the 3 values is: $sum")
}