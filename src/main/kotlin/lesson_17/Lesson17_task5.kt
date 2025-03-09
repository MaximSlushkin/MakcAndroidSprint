package org.example.lesson_17

class UserData(private var _login: String, private val _password: String) {

    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин успешно изменен. \nНовый логин: $_login")
        }
    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
                println("Пароль не может быть изменен!")
            }
        }

fun main() {
    val user = UserData("Макс", "123456789")

    println("Ваш логин: ${user.login}")

    user.login = "Максим Александрович"

    user.password = "987654321"
    println("Ваш пароль: ${user.password}")

}