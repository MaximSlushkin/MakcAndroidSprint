package org.example.lesson_18

open class Box {
    open fun surfaceArea(): Double {
        return 0.0
    }
}

class RectangularBox(private val length: Double, private val width: Double, private val height: Double) : Box() {
    override fun surfaceArea(): Double {

        return 2 * (length * width + width * height + height * length)
    }
}

class Cube(private val edgeLength: Double) : Box() {
    override fun surfaceArea(): Double {

        return 6 * edgeLength * edgeLength
    }
}

fun main() {

    val boxes: List<Box> = listOf(
        RectangularBox(6.3, 8.1, 10.2),
        Cube(7.5)
    )

    for (box in boxes) {
        println(("Площадь поверхности: %.2f".format(box.surfaceArea())))
    }
}