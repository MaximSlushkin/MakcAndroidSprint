package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")

    var number: Long = readln().toLong()

    while (number > 0) {

        println("Осталось секунд: $number")
        Thread.sleep(1000)
        number--
    }

    println("Время вышло.")

}