package org.example.lesson3

fun main() {

    val data = "D2-D4;0"

    val (move, turnNumber) = data.split("-", ";")

    val resaultMoveSplit = move.split("-", ";")
    println("${resaultMoveSplit::class}")

    val fromSquare = resaultMoveSplit[0]
    val toSquare = resaultMoveSplit[1]

    println("Откуда: $fromSquare")
    println("Куда: $toSquare")
    println("Номер хода: $turnNumber")
}