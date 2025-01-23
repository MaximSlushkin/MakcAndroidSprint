package org.example.lesson_5

fun main() {

    println("Введите Ваш год рождения:")

    val yearOfBirth = readln().toInt()
    val currentYear = 2025

    val resultText = if ((currentYear - yearOfBirth) >= 18) {
        "Показать экран со скрытым контентом"
    } else {
        "Доступ заблокировать"
    }

    println(resultText)
}
const val AGE_OF_MAJORITY = 18