package org.example.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("огурец", "помидор", "лук", "майонез", "соль", "укроп")
    println("Список ингредиентов: ${arrayOfIngredients.joinToString()}")

    println("Какой ингредиент Вы хотите заменить?")
    val userInput = readln()

    if (arrayOfIngredients.contains(userInput)) {

        println("На какой ингредиент вы хотите заменить '$userInput'?")
        val userInput2 = readln()

        val indexIngredients = arrayOfIngredients.indexOf(userInput)
        arrayOfIngredients[indexIngredients] = userInput2

        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")

    } else {
        println("Такого ингредиента в этом списке нет.")
    }

}