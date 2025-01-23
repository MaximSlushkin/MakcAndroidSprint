package org.example.lesson_4

fun main() {

    val sunnyWeatherNow: Boolean = true
    val tentOpenNow: Boolean = true
    val humidityNow: Int = 20
    val currentSeasonNow: String = "зима"

    val favorableConditions =
        (sunnyWeatherNow == SANNY_WEATHER && tentOpenNow == TENT_OPEN && (humidityNow == HUMADITY) && currentSeasonNow == CURRENT_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}

const val SANNY_WEATHER: Boolean = true
const val TENT_OPEN: Boolean = true
const val HUMADITY: Int = 20
const val CURRENT_SEASON: String = "не зима"