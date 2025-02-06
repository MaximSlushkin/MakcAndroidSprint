package org.example.lesson_7

fun main() {

    println("Введите количество секунд для таймера:")
    val inputSeconds = readln().toLong()

    for (i in inputSeconds downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }

    println("Время вышло!")

}