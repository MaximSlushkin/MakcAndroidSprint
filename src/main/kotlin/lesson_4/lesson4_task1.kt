package org.example.lesson_4

fun main() {
    val totalTables = 13
    var bookedToday = totalTables
    var bookedTomorrow = 9

    val availableToday = totalTables - bookedToday > 0
    val availableTomorrow = totalTables - bookedTomorrow > 0

    println("Доступность столиков на сегодня: $availableToday")
    println("Доступность столиков на завтра: $availableTomorrow")
}