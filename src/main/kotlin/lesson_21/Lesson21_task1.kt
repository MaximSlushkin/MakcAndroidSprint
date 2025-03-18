package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU"

    return this.count { it in vowels }
}

fun main() {

    val word1 = "hello"
    val word2 = "Макс"

    println("Количество гласных букв в слове $word1: ${word1.vowelCount()}")
    println("Количество гласных букв в слове $word2: ${word2.vowelCount()}")

}