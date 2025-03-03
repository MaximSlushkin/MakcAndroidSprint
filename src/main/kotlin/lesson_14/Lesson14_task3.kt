package org.example.lesson_14

import kotlin.math.pow

abstract class Figure(val color: String) {
    abstract fun square(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun square(): Double {
        return PI * radius.pow(2)
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun square(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {

    val listOfShapes: List<Figure> = listOf(
        Circle("black", 2.0),
        Rectangle("white", 4.0, 5.0),
        Circle("white", 3.0),
        Rectangle("black", 6.0, 3.0)
    )

    val perimeterSumBlack = listOfShapes
        .filter { it.color == "black" }
        .sumOf { it.perimeter() }

    val squareSumWhite = listOfShapes
        .filter { it.color == "white" }
        .sumOf { it.square() }

    println("Сумма периметров черных фигур: ${"%.3f".format(perimeterSumBlack)}")
    println("Сумма площадей белых фигур: ${"%.3f".format(squareSumWhite)}")
}

const val PI = 3.14