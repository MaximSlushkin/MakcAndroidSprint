package org.example.lesson3

fun main() {

    val from = "E2"
    val to = "E4"
    val moveNumber = 1

    val moveString = "$from-$to;$moveNumber"
    println(moveString)

    val nextFrom = "D2"
    val nextTo = "D3"
    val nextMoveNumber = 2

    val nextMoveString = "$nextFrom-$nextTo;$nextMoveNumber"
    println(nextMoveString)

}
