package org.example.lesson_12

class WeatherConditionsReport(

    dayTimeTemperatureKelvin: Int, nightTimeTemperatureKelvin: Int, precipitation: Boolean

) {

    val dayTimeTemperature: Int = dayTimeTemperatureKelvin - CELSIUS_VALUE_TEMP
    val nightTimeTemperature: Int = nightTimeTemperatureKelvin - CELSIUS_VALUE_TEMP
    val precipitationPerDay: Boolean = precipitation

    // Метод для вывода информации о погоде
    fun printWeather() {
        println("Дневная температура: $dayTimeTemperature°C")
        println("Ночная температура: $nightTimeTemperature°C")
        println("Наличие осадков: ${if (precipitationPerDay) "Присутствуют" else "Отсутствуют"}")
    }

    init {
        println("Погода на сегодня:")
        printWeather()
    }
}

fun main() {

    val todayWeather =
        WeatherConditionsReport(dayTimeTemperatureKelvin = 285, nightTimeTemperatureKelvin = 261, precipitation = true)

}

const val CELSIUS_VALUE: Int = 273