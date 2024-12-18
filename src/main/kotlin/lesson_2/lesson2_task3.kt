package lesson_2

fun main () {

    val departureHours = 9
    val departureMinutes = 39
    val travelMinutes = 457

    val totalDepartureMinutes = departureHours * 60 + departureMinutes
    val arrivalMinutes = totalDepartureMinutes + travelMinutes

    val arrivalHours = arrivalMinutes / 60
    val arrivalMinutesRemaining = arrivalMinutes % 60

    println("Время прибытия $arrivalHours:${
        String.format("%02d", arrivalMinutesRemaining)}")

}