package org.example.lesson_6


fun main() {

    val randomNumber = (1..9).random()
    var attempts = 5

    println("Угадайте число от 1 до 9. У вас есть $attempts попыток.")

    while (attempts > 0) {
        print("Введите число: ")
        val userInput = readln().toInt()

        if (userInput < RANGE1 || userInput > RANGE2) {
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

const val RANGE1 = 1
const val RANGE2 = 9