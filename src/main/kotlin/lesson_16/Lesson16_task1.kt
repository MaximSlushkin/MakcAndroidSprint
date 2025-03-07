package org.example.lesson_16

class Cube() {

    private val randomNumber: Int = (1..6).random()
    fun cubeValue() {
        println("Выпавшее число: $randomNumber")

    }
}

fun main() {
    val cube = Cube()
    cube.cubeValue()
}