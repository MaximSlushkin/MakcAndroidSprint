package org.example.lesson_6


fun main() {
    println("Введите количество секунд, которые нужно засечь:")

    var number: Long = readln().toLong()

    Thread.sleep(number * 1000)

    println("Прошло $number секунд")

}