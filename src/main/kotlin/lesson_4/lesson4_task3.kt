package org.example.lesson_4

fun main() {
    val isSunnyWeather: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "зима"

    val favorableConditions = isSunnyWeather && isTentOpen && humidity == 20 && currentSeason != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}
