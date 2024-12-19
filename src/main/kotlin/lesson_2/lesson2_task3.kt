package lesson_2

fun main () {

    val departureHours = 9
    val departureMinutes = 39
    val travelMinutes = 457

    val totalDepartureMinutes = departureHours * const + departureMinutes
    val arrivalMinutes = totalDepartureMinutes + travelMinutes

    val arrivalHours = arrivalMinutes / const
    val arrivalMinutesRemaining = arrivalMinutes % const

    println("Время прибытия: $arrivalHours:$arrivalMinutesRemaining")

}
val const = 60