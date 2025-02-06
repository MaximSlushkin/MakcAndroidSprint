package org.example.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("огурец", "помидор", "лук", "майонез", "соль", "укроп")
    println("Какой ингредиент Вы хотите найти?")

    val userInput = readln().toString()

    if (arrayOfIngredients.contains(userInput)) {
        println("Ингредиент $userInput в рецепте есть")

    } else {
        println("Такого ингредиента в рецепте нет")
        return
    }

}