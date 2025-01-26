package org.example.lesson_5

import kotlin.random.Random

fun main() {
    var rangeWinNumbers = 0..42
    val winningNumber = List(3) { Random.nextInt(rangeWinNumbers.first, rangeWinNumbers.last + 1) }.distinct()
    println("Введите три числа от 0 до 42")

    val userInputNumbers = mutableListOf<Int>()

    repeat(3) { index ->
        println("Число ${index + 1}: ")
        val number = readLine()?.toIntOrNull()

        if (number != null && number in 0..42) {
            userInputNumbers.add(number)
        } else {
            println("Пожалуйста введите корректное число от 0 до 42")
        }

        val definitionOfMatches = userInputNumbers.intersect(winningNumber).size

        val messageForUser = when (definitionOfMatches) {
            3 -> "Поздравляем! Вы угадали все числа и выиграли джекпот"
            2 -> "Поздравляем! Вы угадали два числа и выиграли крупный приз"
            1 -> "Поздравляем! Вы угадали одно  число и выиграли утешительный приз"
            0 -> "Вы не угадали ни одного числа"
            else -> "Что-то пошло не так"
        }
        println(messageForUser)
    }
    println("Выигрышные числа $winningNumber")
}