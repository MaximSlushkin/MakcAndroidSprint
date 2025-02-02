package org.example.lesson_6

import kotlin.random.Random

fun main() {

    val randomNumber = Random.nextInt(1, 10)
    var attempts = 5

    println("Угадайте число от 1 до 9. У вас есть $attempts попыток.")

    while (attempts > 0) {
        print("Введите число: ")
        val userInput = readln().toInt()

        if (userInput < 1 || userInput > 9) {
            println("Пожалуйста, введите число от 1 до 9.")
            continue
        }

        if (userInput == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            attempts--
            println("Неверно! Попробуйте еще раз. Оставшиеся попытки: $attempts")
        }
    }

    println("Было загадано число $randomNumber.")
}