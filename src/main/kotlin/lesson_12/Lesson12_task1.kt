package org.example.lesson_12

class WeatherData() {

    var dayTimeTemperature = 10
    var nightTimeTemperature = -10
    var precipitationPerDay: Boolean = false
}

fun main() {

    val day = WeatherData()
    day.dayTimeTemperature = 12

    val night = WeatherData()
    night.nightTimeTemperature = -5

    println("Дневная температура: ${day.dayTimeTemperature}°C ")
    println("Ночная температура: ${night.nightTimeTemperature}°C")

}