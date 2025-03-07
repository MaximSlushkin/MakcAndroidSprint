package org.example.lesson_16

private const val PI: Double = 3.14

class Circle(private val radius: Double) {

    fun circleLength(): Double {
        return 2 * PI * radius
    }

    fun areaOfTheCircle(): Double {
        return PI * radius * radius
    }
}

fun main() {

    val circle = Circle(7.5)
    val length = circle.circleLength()
    val area = circle.areaOfTheCircle()

    println("Длина окружности: $length")
    println("Площадь круга: $area")
}