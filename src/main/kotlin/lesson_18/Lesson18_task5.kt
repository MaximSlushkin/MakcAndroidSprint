package org.example.lesson_18

class Screen {

    fun drawCircle(x: Int, y: Int): String {
        return "Нарисован круг в координатах ($x, $y)"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисован круг в координатах (${x.toInt()}, ${y.toInt()})"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Нарисован квадрат в координатах ($x, $y)"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Нарисован квадрат в координатах (${x.toInt()}, ${y.toInt()})"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Нарисована точка в координатах ($x, $y)"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Нарисована точка в координатах (${x.toInt()}, ${y.toInt()})"
    }
}

fun main() {
    val screen = Screen()

    println(screen.drawCircle(1, 2))
    println(screen.drawSquare(3, 4))
    println(screen.drawPoint(5, 6))

    println(screen.drawCircle(1.5f, 2.5f))
    println(screen.drawSquare(3.1f, 4.7f))
    println(screen.drawPoint(5.9f, 6.3f))
}