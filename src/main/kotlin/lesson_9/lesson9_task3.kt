package org.example.lesson_9

fun main() {

    val ingredientsForOmelet = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val userInput = readln().toInt()

    val totalEggs = ingredientsForOmelet[0] * userInput
    val totalMilk = ingredientsForOmelet[1] * userInput
    val totalButter = ingredientsForOmelet[2] * userInput

    println("На $userInput порций вам понадобится: Яиц – $totalEggs, молока – $totalMilk мл, сливочного масла – $totalButter гр.")
}