package org.example.lesson_16

class User(private val username: String, private val password: String) {

    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {

    val user = User("Max", "IloveMyChild")

    println("Введите ваш пароль:")
    val inputPassword = readln()
    val isPasswordValid = user.validatePassword(inputPassword)

    println("Пароль введён верно: $isPasswordValid")
}