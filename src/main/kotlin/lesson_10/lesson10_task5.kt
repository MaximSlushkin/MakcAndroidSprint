package org.example.lesson_10

const val VALID_USERNAME = "MaximSlushkin"
const val VALID_PASSWORD = "HelloWorld"

val basketContents = listOf("Ноутбук", "Телевизор", "Смартфон")

fun main() {

    println("Введите логин:")
    val username = readln().trim()

    println("Введите пароль:")
    val password = readln().trim()

    val token = authorize(username, password)

    if (token != null) {
        println("Авторизация успешна. Токен доступа: $token")

        val basketOfGoods = getBasket(token)
        if (basketOfGoods != null) {

            println("Содержимое вашей корзины: ${basketOfGoods.joinToString()}")
        }
    } else {

        println("Неправильная авторизация. Проверьте правильность логина и пароля.")
    }
}

fun authorize(username: String, password: String): String? {
    return if (username == VALID_USERNAME && password == VALID_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val token = (1..32).map { chars[(Math.random() * chars.length).toInt()] }.joinToString("")
    return token
}

fun getBasket(token: String): List<String>? {

    return basketContents
}