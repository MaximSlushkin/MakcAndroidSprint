package org.example.lesson_1

fun main() {

    val secondsInMinute = 60
    val secondsInHour = secondsInMinute * 60
    var totalSeconds: Int = 6480

    val hour = totalSeconds / secondsInHour
    val minute = (totalSeconds % secondsInHour) / secondsInMinute

    println("Время проведенное в космосе ${String.format("%02d", hour)}:$minute:00")
}
