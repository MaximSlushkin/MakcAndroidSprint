package org.example.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("огурец", "помидор", "лук", "майонез", "соль", "укроп")
    println("Список ингредиентов: ${arrayOfIngredients.joinToString()}")

    println("Какой ингредиент Вы хотите заменить?")
    val userInput = readln()

    val indexIngredients = arrayOfIngredients.indexOf(userInput)

    if (indexIngredients != -1) {

        println("На какой ингредиент вы хотите заменить '$userInput'?")
        val userInput2 = readln()

        arrayOfIngredients[indexIngredients] = userInput2

        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")

    } else {
        println("Такого ингредиента в этом списке нет.")
    }

}