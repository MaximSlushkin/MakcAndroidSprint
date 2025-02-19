package org.example.lesson_11

class User2(
    val id: Int,
    val userName: String,
    var userPassword: String,
    val userEmail: String,
    var bio: String? = null,
) {
    fun userInfo() {
        println("$id")
        println("$userName")
        println("$userEmail")
        println("${bio ?: "Нет информации о пользователе."}") // Вывод информации о себе или сообщение о ее отсутствия
    }

    fun readBio() {
        println("Введите информацию о себе:")
        bio = readln()
        println("Информация о себе обновлена.")
    }

    fun changePassword() {

        println("Введите ваш пароль:")
        val currentPassword = readln()

        if (currentPassword == userPassword) {
            println("Введите новый пароль:")
            userPassword = readln()
            println("Пароль изменен.")
        } else {
            println("Неправильный пароль.")
        }
    }
}

fun main() {

    val userData = User2(

        id = 1,
        userName = "MaxSlushkin",

        userPassword = "12349876",
        userEmail = "maxslushkin@mail.ru"
    )

    println("Информация о пользователе:")
    userData.userInfo()

    userData.readBio()

    userData.changePassword()

    println("Данные обновлены:")
    userData.userInfo()
}