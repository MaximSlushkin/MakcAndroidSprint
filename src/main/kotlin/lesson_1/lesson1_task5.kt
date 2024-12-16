package org.example.lesson_1

fun main() {

    var totalSeconds: Int = 6480


    val hour = totalSeconds / 3600
    val minute = (6480 % 3600) / 60

    println("0$hour:$minute")


}