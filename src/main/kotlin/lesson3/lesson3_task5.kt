package org.example.lesson3

fun main() {

    val data = "D2-D4;0"

    val (move, turnNumber) = data.split(";")

    val (fromSquare, toSquare) = move.split("-")

    println("Откуда: $fromSquare")
    println("Куда: $toSquare")
    println("Номер хода: $turnNumber")
}
