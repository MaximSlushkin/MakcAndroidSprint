package org.example.lesson_5

fun main() {

    val winningNumber1 = 15
    val winningNumber2 = 41

    println("Введите первое число от 0 до 42")
    val userInputNum1 = readLine()?.toInt()

    println("Введите второе число от 0 до 42")
    val userInputNum2 = readLine()?.toInt()

    val guessedNumber1 = (userInputNum1 == winningNumber1 || userInputNum1 == winningNumber2)
    val guessedNumber2 = (userInputNum2 == winningNumber1 || userInputNum2 == winningNumber2)

    when {
        guessedNumber1 && guessedNumber2 -> {
            println("Поздравляем! Вы выиграли гланый приз!")
        }

        guessedNumber1 || guessedNumber2 -> {
            println("Вы выиграли утешительный приз")
        }

        else -> {
            println("Неудача")
        }

    }
    println("Выигрышные числа: $winningNumber1 и $winningNumber2")
}