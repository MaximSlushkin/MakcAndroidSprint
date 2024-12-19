package lesson_1

fun main () {

    val year: Int = 1961
    var takeOfHour: String = String.format("%02d", 9)
    var takeOfMinute: String = String.format("%02d", 7)

    println(year)
    println("$takeOfHour:$takeOfMinute")

    var boardingHour = 10
    var boardingMinute = 55
    println("$boardingHour:$boardingMinute")
}