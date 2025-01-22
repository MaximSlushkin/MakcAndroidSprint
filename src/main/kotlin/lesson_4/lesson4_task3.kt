package org.example.lesson_4

fun main() {

    val sunnyWeatherNow: Boolean = true
    val tentOpenNow: Boolean = true
    val humidityNow: Int = 20
    val currentSeasonNow: String = "зима"

    val favorableConditions = (sunnyWeatherNow && tentOpenNow && humidityNow == 20 && currentSeasonNow == "зима")
            || (SANNY_WEATHER && TENT_OPEN && HUMADITY == 20 && CURRENT_SEASON != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}

const val SANNY_WEATHER: Boolean = true
const val TENT_OPEN: Boolean = true
const val HUMADITY: Int = 20
const val CURRENT_SEASON: String = "не зима"