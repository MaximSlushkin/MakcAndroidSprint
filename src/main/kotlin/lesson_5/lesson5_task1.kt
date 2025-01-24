package org.example.lesson_5

fun main() {
    println("Подтвердите, что вы не бот, решив данный пример: 5 + 5 = ?")
    val resaultUserInput = readLine()?.toInt()
    val resaultText = if (resaultUserInput == correctResult) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }
    println(resaultText)
}

const val correctResult: Int = 10
