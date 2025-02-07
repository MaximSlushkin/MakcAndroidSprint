package org.example.lesson_8

fun main() {

    val numberOfIngredients = readln().toInt()

    val listOfIngredients = Array(numberOfIngredients) { "" }

    for (i in listOfIngredients.indices) {

        println("Введите ингредиент ${i + 1}: ")
        listOfIngredients[i] = readln()

    }
    println("Ваш список ингредиентов : ${listOfIngredients.joinToString(", ")}")

}