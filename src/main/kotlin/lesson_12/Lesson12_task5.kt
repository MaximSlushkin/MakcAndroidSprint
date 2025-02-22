package org.example.lesson_12

const val CELSIUS_VALUE_TEMP: Int = 273

class AverageTemperatureValue(

    dayTimeTemperatureKelvin: Int,
    nightTimeTemperatureKelvin: Int,
    precipitation: Boolean,

) {
    val dayTimeTemperature: Int = dayTimeTemperatureKelvin - CELSIUS_VALUE_TEMP
    val nightTimeTemperature: Int = nightTimeTemperatureKelvin - CELSIUS_VALUE_TEMP
    val precipitationPerDay: Boolean = precipitation

}

fun main() {

    val weatherReportsList = mutableListOf<AverageTemperatureValue>()

    for (i in 1..30) {

        val dayTimeTemperatureKelvin = (250..320).random()
        val nightTimeTemperatureKelvin = (230..300).random()

        val randomPrecipitation = listOf(true, false)
        val precipitation = randomPrecipitation.random()

        weatherReportsList.add(
            AverageTemperatureValue(
                dayTimeTemperatureKelvin,
                nightTimeTemperatureKelvin,
                precipitation
            )
        )
    }

    val dayTemperatures = weatherReportsList.map { it.dayTimeTemperature }
    val nightTemperatures = weatherReportsList.map { it.nightTimeTemperature }

    val precipitationDays = weatherReportsList.count() { it.precipitationPerDay }

    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()

    println("Средняя дневная температура за месяц: %.2f°C".format(averageDayTemperature))
    println("Средняя ночная температура за месяц: %.2f°C".format(averageNightTemperature))
    println("Количество дней с осадками: $precipitationDays")
}