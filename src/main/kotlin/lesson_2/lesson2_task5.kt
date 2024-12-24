package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val depositAmount = 70_000.0
    val baseRate = 16.7 / totalPercentage
    val depositPeriod = 20

    val finalAmount = depositAmount * (1 + baseRate).pow(depositPeriod)

    println(String.format("Итоговый размер вклада через 20 лет: %.3f", finalAmount))
}

const val totalPercentage = 100