package org.example.lesson_5

fun main() {

    println("Введите расстояние поездки в километрах:")
    val distance = readLine()?.toDoubleOrNull() ?: return

    println("Введите расход топлива на 100 км(в литрах):")
    val fuelConsumption = readLine()?.toDoubleOrNull() ?: return

    println("Введите текущую цену за литр:")
    val fuelPrice = readLine()?.toDoubleOrNull() ?: return

    val totalAmountFuel = (distance * fuelConsumption) / 100

    val totalCostFuel = totalAmountFuel * fuelPrice

    println("Общее количество необходимого топлива: ${"%.2f".format(totalAmountFuel)}")
    println("Итоговая стоимость поездки: ${"%.2f".format(totalCostFuel)}")

}