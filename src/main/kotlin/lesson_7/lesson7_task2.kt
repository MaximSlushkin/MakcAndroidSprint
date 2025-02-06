package org.example.lesson_7

fun main() {

    do {

        var numberRange = (1000..9999).random().toLong()
        println("Ваш код авторизации: $numberRange")

        println("Введите код, чтобы авторизоваться: ")
        var inputUser = readln().toLong()

        if (inputUser != numberRange) {
            println("Неверный код. Попробуйте снова.")
        }
    } while (inputUser != numberRange)

    println("Приветствуем Вас!")
}