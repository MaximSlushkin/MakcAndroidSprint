package org.example.lesson_4

fun main() {

    val hasDamage: Boolean = readLine()?.toBoolean() ?: false
    val crewCount: Int = readLine()?.toInt() ?: 0
    val foodBoxes: Int = readLine()?.toInt() ?: 0
    val favorableWeather: Boolean = readLine()?.toBoolean() ?: false

    val canSail = (
            (!hasDamage == IS_CASE_DAMAGE && crewCount in MIN_CREW_COUNT..MAX_CREW_COUNT && foodBoxes > MIN_FOOD_BOXES && favorableWeather) ==
                    (hasDamage == IS_CASE_DAMAGE && crewCount == RECOMMENDED_CREW_COMPOSITION_DAMAGE && favorableWeather && foodBoxes >= MIN_FOOD_BOXES))

    if (canSail) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_FOOD_BOXES = 50
const val RECOMMENDED_CREW_COMPOSITION_DAMAGE = 70
const val IS_CASE_DAMAGE = true