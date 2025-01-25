package org.example.lesson_5

fun main() {

    val number1 = 5
    val number2 = 5

    val correctResult: Int = number1 + number2

    println("Подтвердите, что вы не бот, решив данный пример: $number1 + $number2 = ?")

    val resaultUserInput = readLine()?.toInt()
    val resaultText = if (resaultUserInput == correctResult) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }
    println(resaultText)
}

const val correctResult: Int = 10