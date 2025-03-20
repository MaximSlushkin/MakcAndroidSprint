package org.example.lesson_22

data class Lesson22Task3(val lenght: Int, val width: Int, val height: Int)

fun main() {

    val value = Lesson22Task3(100, 200, 300)

    val (l, w, h) = value
    println("Длина: $l\nШирина: $w\nВысота: $h")
}
