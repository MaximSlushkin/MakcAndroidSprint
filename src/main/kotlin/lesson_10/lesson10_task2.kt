package org.example.lesson_10

fun main() {

    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    if (checkingTheEnterData(userLogin) && checkingTheEnterData(userPassword)) {
        println("Добро пожаловать, $userLogin!")
    } else {
        println("Логин или пароль недостаточно длинные. Пожалуйста введите минимум 4 символа.")
    }
}

fun checkingTheEnterData(inputUser: String): Boolean {
    return inputUser.length >= 4
}