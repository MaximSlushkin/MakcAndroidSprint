package org.example.lesson_12

//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//- в этой задаче используй первичный конструктор без выделения памяти под свойства;
//- поля должны быть объявлены и проинициализированы в теле класса;
//- все поля с температурой должны иметь тип Int;
//- программа не должна иметь других функций, кроме метода вывода информации о погоде.
//
//В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.
//
//Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.
const val CELSIUS = 273

class WeatherReport(

    dayTimeTemperatureKelvin: Int, nightTimeTemperatureKelvin: Int, precipitation: Boolean

) {

    val dayTimeTemperature: Int = dayTimeTemperatureKelvin - CELSIUS_VALUE_TEMP
    val nightTimeTemperature: Int = nightTimeTemperatureKelvin - CELSIUS_VALUE_TEMP
    val precipitationPerDay: Boolean = precipitation

    fun printWeather() {
        println("Дневная температура: $dayTimeTemperature°C")
        println("Ночная температура: $nightTimeTemperature°C")
        println("Наличие осадков: ${if (precipitationPerDay) "Присутствуют" else "Отсутствуют"}")
    }
}

fun main() {

    val todayWeather =
        WeatherReport(dayTimeTemperatureKelvin = 278, nightTimeTemperatureKelvin = 255, precipitation = true)


    todayWeather.printWeather()
}