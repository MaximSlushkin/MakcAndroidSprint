package org.example.lesson_12

class WeatherInfo(
    var dayTimeTemperature: Int, var nightTimeTemperature: Int, var precipitationPerDay: Boolean) {

    fun printWeather() {

        println("Дневная температура: $dayTimeTemperature°C")
        println("Ночная температура: $nightTimeTemperature°C")
        println("Наличие осадков: ${if (precipitationPerDay) "Присутствуют" else "Отсутствуют"}")
    }
}

fun main() {

    val todayWeather = WeatherInfo(dayTimeTemperature = 10, nightTimeTemperature = -17, precipitationPerDay = true)

    todayWeather.printWeather()

}