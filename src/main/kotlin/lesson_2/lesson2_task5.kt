package org.example.lesson_2

fun main() {

    val depositAmount = 70_000.0
    val interestRate = 16.7 / 100
    val depositPeriod = 20

    val finalAmount = depositAmount * Math.pow(1 + interestRate, depositPeriod.toDouble())

    println(String.format("Итоговый размер вклада через 20 лет: %.3f", finalAmount))
}