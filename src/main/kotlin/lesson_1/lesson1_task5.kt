package org.example.lesson_1
fun main() {
    var totalSeconds: Int = 6480

    val hour = totalSeconds / secondsInMinAndHour
    val minute = (totalSeconds % secondsInMinAndHour) / secondsInMinAndHour
    val seconds = totalSeconds % secondsInMinAndHour

    println("Время проведенное в космосе: ${String.format("%02d:%02d:%02d", hour, minute, seconds)}")
}
const val secondsInMinAndHour = 60