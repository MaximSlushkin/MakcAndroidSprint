package org.example.lesson_1
fun main() {
    var totalSeconds: Int = 6480

    val hour = totalSeconds / secondsInMinAndHour
    val minute = (totalSeconds % secondsInMinAndHour) / secondsInMinAndHour

    println("Время проведенное в космосе ${String.format("%02d", hour)}:$minute:00")
}

const val secondsInMinAndHour = 60
