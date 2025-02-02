package org.example.lesson_6

import kotlin.random.Random

fun main() {
    val totalAttempts = 3

    val number1 = Random.nextInt(1, 10)
    val number2 = Random.nextInt(1, 10)

    for (attempt in 1..totalAttempts) {

        println("Попытка $attempt: Подтвердите, что вы не бот, решив данный пример: $number1 + $number2 = ?")

        val userInput = readln().toInt()

        if (userInput == number1 + number2) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно. Попробуйте еще раз.")
        }
    }

    println("Доступ запрещен.")
}