package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun weatherInfo(): String
}

class Temperature(val tempValue: Double) : WeatherStationStats() {
    override fun weatherInfo(): String {
        return "Температура: $tempValue °C."
    }
}

class PrecipitationAmount(val precipitations: Double) : WeatherStationStats() {
    override fun weatherInfo(): String {
        return "Количество осадков: $precipitations мм."
    }
}

class WeatherServer {
    fun weatherInfo(stats: WeatherStationStats) {

        println("Отправка данных о погоде на сервер...")
        println(stats.weatherInfo())
    }
}

fun main() {

    val weatherServer = WeatherServer()

    val temperatureData = Temperature(-10.5)
    val precipitationData = PrecipitationAmount(11.3)

    weatherServer.weatherInfo(temperatureData)
    weatherServer.weatherInfo(precipitationData)
}