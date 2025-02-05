package org.example.lesson_7

fun main() {

    val lettersRange = ('a'..'z')
    val numbersRange = (0..9)

    var generatedPassword: String = ""

    for (i in 0 until 6) {
        generatedPassword += if (i % 2 == 0) {
            lettersRange.random()
        } else {
            numbersRange.random()
        }
    }
    println("Сгенерированный пароль: $generatedPassword")
}