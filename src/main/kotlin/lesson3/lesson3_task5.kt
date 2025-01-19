package org.example.lesson3

fun main() {

    val data = "D2-D4;0"

    val partOfTheMove = data.split("-", ";")

    val fromSquare = partOfTheMove[0]
    val toSquare = partOfTheMove[1]
    val turnNumber = partOfTheMove[2]

    println("Откуда: $fromSquare")
    println("Куда: $toSquare")
    println("Номер хода: $turnNumber")
}