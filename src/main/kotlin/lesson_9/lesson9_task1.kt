package org.example.lesson_9

fun main() {

    val listOfIngredients = listOf("лук", "огурец", "помидор", "соль", "майонез")
    println("В рецепте есть следующие ингредиенты: \n${listOfIngredients.joinToString("\n")}")
}