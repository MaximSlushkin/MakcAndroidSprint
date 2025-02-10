package org.example.lesson_9

fun main() {
    val ingredientsList = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите ингредиент $i:")
        val ingredientUser = readln()
        ingredientsList.add(ingredientUser)
    }

    var sortedIngredients: String = ingredientsList.sorted().joinToString()

    if (sortedIngredients.isNotEmpty()) {

        val finalListOfIngredients = sortedIngredients.replaceFirstChar { char -> char.uppercase() }

        println("Ваш список ингредиентов: $finalListOfIngredients.")
    }

}