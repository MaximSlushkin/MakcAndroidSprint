package org.example.lesson_2

import kotlin.math.pow

fun main() {

    var depositAmount = 70_000.0
    var baseRate = 16.7
    var depositPeriod = 20

    val finalAmount = depositAmount * (1 + baseRate / TOTAL_PERCENTAGE).pow(depositPeriod)
    println(String.format("Итоговый размер вклада через 20 лет: %.3f", finalAmount))
}

const val TOTAL_PERCENTAGE = 100