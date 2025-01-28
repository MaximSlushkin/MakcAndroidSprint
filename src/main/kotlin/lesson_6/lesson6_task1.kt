package org.example.lesson_6

fun main() {
    val userLogin = "userKotlinSprint"
    val userPassword = "KotlinSprint123"

    println("Регистрация в приложении.")

      print("Введите логин: ")
    var enteredLogin = readln()

     print("Введите пароль: ")
    var enteredPassword = readln()

       while (enteredLogin != userLogin || enteredPassword != userPassword) {
        println("Неверный логин или пароль. Попробуйте еще раз.")

        print("Введите логин: ")
        enteredLogin = readln()

        print("Введите пароль: ")
        enteredPassword = readln()
    }

    println("Авторизация прошла успешно.")
}