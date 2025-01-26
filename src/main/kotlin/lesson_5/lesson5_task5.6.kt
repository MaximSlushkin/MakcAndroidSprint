package org.example.lesson_5

fun main() {

    println("Введите ваш вес в килограммах:")
    val weight = readLine()?.toDoubleOrNull() ?: return

    println("Введите ваш рост в сантиметрах:")
    val heightInCm = readLine()?.toDoubleOrNull() ?: return

    val heightInMeters = heightInCm / CM_TO_METERS

    val bmi = weight / (heightInMeters * heightInMeters)

    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25 -> "Нормальная масса тела"
        bmi < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш индекс массы тела: ${"%.2f".format(bmi)}")
    println("Категория: $category")
}

const val CM_TO_METERS: Double = 100.0