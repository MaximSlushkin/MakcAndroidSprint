package org.example.lesson3

fun main() {

    val number = 6

    val multiplicationTable = buildString {
        for (i in 1..9) {
            append("$number x $i = ${number * i}\n")
        }
    }.trim()

    println(multiplicationTable)
}