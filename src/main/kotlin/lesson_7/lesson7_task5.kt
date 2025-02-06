package org.example.lesson_7

fun main() {
    val passwordLength = getPasswordLength()
    val password = generatePassword(passwordLength)
    println("Сгенерированный пароль: $password")
}

fun getPasswordLength(): Int {
    var lengthPassword: Int

    do {
        print("Введите длину пароля (минимум 6 символов): ")
        lengthPassword = readln().toInt()
    } while (lengthPassword < 6)
    return lengthPassword
}

fun generatePassword(length: Int): String {

    val lowerCaseLetters = ('a'..'z').toList()
    val capitalLetters = ('A'..'Z').toList()
    val numbersRange = ('0'..'9').toList()

    val allChars = lowerCaseLetters + capitalLetters + numbersRange

    val passwordGenerator = StringBuilder()
    passwordGenerator.append(lowerCaseLetters.random())
    passwordGenerator.append(capitalLetters.random())
    passwordGenerator.append(numbersRange.random())

    repeat(length - 3) {
        passwordGenerator.append(allChars.random())
    }

    return passwordGenerator.toList().shuffled().joinToString("")
}