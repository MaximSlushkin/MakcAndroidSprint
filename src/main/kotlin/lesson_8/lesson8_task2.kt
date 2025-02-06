package org.example.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("огурец", "помидор", "лук", "майонез", "соль", "укроп")
    println("Какой ингредиент Вы хотите найти?")

    val userInput = readln()

    for (i in arrayOfIngredients) {
        if (i == userInput) {
            println("Ингридиент $userInput в рецепте есть")
        } else {
            println("Такого ингрединета в рецепте нет")
            return
        }

    }

}