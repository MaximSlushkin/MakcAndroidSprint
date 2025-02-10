package org.example.lesson_9

fun main() {

    println("Введите 5 ингредиентов (перечислите через запятую с пробелом): ")
    var inputUser = readln()

    val ingredientsList = inputUser.split(", ")

    inputUser = ingredientsList.sorted().toString()

    println("Ваш список ингредиентов: ${ingredientsList.joinToString()}")

}