package org.example.lesson_4

fun main() {
    val hasDamage: Boolean = readLine()?.toBoolean() ?: false
    val crewCount: Int = readLine()?.toInt() ?: 0
    val foodBoxes: Int = readLine()?.toInt() ?: 0
    val favorableWeather: Boolean = readLine()?.toBoolean() ?: false

    val canSail = (
            (!hasDamage && crewCount in 55..70 && foodBoxes > 50 && (favorableWeather || !favorableWeather))
            ) || (
            hasDamage && crewCount == 70 && favorableWeather && foodBoxes >= 50
            )

    if (canSail) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}