package org.example.lesson_9

fun main() {

    val ingredientsForOmelet = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val userInput = readln().toInt()

    val totalIngredients = ingredientsForOmelet.map { it * userInput }

    val totalEggs = totalIngredients[0]
    val totalMilk = totalIngredients[1]
    val totalButter = totalIngredients[2]


    println("На $userInput порций вам понадобится: Яиц – $totalEggs, молока – $totalMilk мл, сливочного масла – $totalButter гр.")
}