package org.example.lesson_10

fun main() {
    println("Введите длину пароля:")
    val lengthPassword = readln().toInt()

    var password = generatePassword(lengthPassword)
    println("Ваш пароль: $password")
}

fun generatePassword(lengthPassword: Int): String {
    val numbers = "0123456789"
    val specialChars = "!\"#$%&'()*+,-./ "
    var generateResult = ""

    for (i in 0 until lengthPassword) {
        generateResult += if (i % 2 == 0) {
            numbers.random()
        } else {
            specialChars.random()
        }
    }

    return generateResult
}