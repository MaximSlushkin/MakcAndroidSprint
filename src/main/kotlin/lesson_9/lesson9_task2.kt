package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("лук", "перец", "огурец")
    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString()}.")

    println("Желаете добавить еще?")
    val userInput = readln()

    if (userInput.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")

        val userInput2 = readln()
        listOfIngredients.add(userInput2)

    } else {
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString()} .")

}