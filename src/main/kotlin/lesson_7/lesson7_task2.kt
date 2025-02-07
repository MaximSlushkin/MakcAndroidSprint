package org.example.lesson_7

fun main() {
    var numberRange: Int
    var inputUser: Int

    do {

        numberRange = (1000..9999).random().toInt()
        println("Ваш код авторизации: $numberRange")

        println("Введите код, чтобы авторизоваться: ")
        inputUser = readln().toInt()

    } while (inputUser != numberRange)

    println("Приветствуем Вас!")
}