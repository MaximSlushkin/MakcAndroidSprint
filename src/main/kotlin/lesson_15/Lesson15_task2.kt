package org.example.lesson_15

abstract class WeatherStationStats {

}

class Temperature(val tempValue: Double) : WeatherStationStats() {
    fun weatherInfo(): String {
        return "Температура: $tempValue °C."
    }
}

class PrecipitationAmount(val precipitations: Double) : WeatherStationStats() {
    fun weatherInfo(): String {
        return "Количество осадков: $precipitations мм."
    }
}

class WeatherServer {
    fun sendWeatherInfo(stats: WeatherStationStats) {
        println("Отправка данных о погоде на сервер...")
        when (stats) {
            is Temperature -> println(stats.weatherInfo())
            is PrecipitationAmount -> println(stats.weatherInfo())
        }
    }
}

fun main() {
    val weatherServer = WeatherServer()

    val temperatureData = Temperature(-10.5)
    val precipitationData = PrecipitationAmount(11.3)

    weatherServer.sendWeatherInfo(temperatureData)
    weatherServer.sendWeatherInfo(precipitationData)
}