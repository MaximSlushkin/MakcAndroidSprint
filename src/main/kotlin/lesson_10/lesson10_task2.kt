package org.example.lesson_10

fun main() {

    println("Введите логин:")
    val userLogin = readln()


    println("Введите пароль:")
    val userPassword = readln()

    if (checkingTheEnterData(userLogin, userPassword)) {
        println("Добро пожаловать, $userLogin!")
    } else {
        println("Логин или пароль недостаточно длинные. Пожалуйста введите минимум 4 символа.")
    }
}

fun checkingTheEnterData(userPassword: String, userLogin: String): Boolean {
    return userLogin.length >= 4 && userPassword.length >= 4
}