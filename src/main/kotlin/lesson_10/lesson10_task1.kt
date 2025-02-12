package org.example.lesson_10

fun main() {

    val playerThrow = generatingResult()
    println("Игрок бросил кубик и выпало: $playerThrow")


    val computerThrow = generatingResult()
    println("Компьютер бросил кубик и выпало: $computerThrow")

    when {
        playerThrow > computerThrow -> println("Победило человечество!")
        computerThrow > playerThrow -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}

fun generatingResult(): Int {
    return (1..6).random()
}