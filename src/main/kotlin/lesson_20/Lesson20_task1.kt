package org.example.lesson_20

fun main() {

    val greeting: (String) -> String = { username: String ->
        "С наступающим Новым Годом, $username!"
    }

    val username = "Макс"

    println(greeting(username))
}