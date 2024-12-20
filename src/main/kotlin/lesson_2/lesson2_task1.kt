package org.example.lesson_2

fun main() {
    val evaluations = listOf(3, 4, 3, 5)
    val averageScore = evaluations.average()

    val changedAverage = String.format("%.2f", averageScore)

    println("$changedAverage")
}