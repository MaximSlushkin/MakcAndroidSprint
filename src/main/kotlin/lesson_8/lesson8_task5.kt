package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов: ")

    val listOfIngredients = Array(readln().toInt()) { readln() }

    println("Ваш список ингредиентов: ${listOfIngredients.joinToString(", ")}.")
}