package org.example.lesson_18

open class Dice(val sides: Int) {
    open fun roll(): Int {
        return (1..sides).random()
    }
}

class FourSidedCube : Dice(4) {
    override fun roll(): Int {
        val result = super.roll()
        println("Бросок 4-гранной кости: $result")
        return result
    }
}

class SixSidedCube : Dice(6) {
    override fun roll(): Int {
        val result = super.roll()
        println("Бросок 6-гранной кости: $result")
        return result
    }
}

class EightSidedCube : Dice(8) {
    override fun roll(): Int {
        val result = super.roll()
        println("Бросок 8-гранной кости: $result")
        return result
    }
}

fun main() {

    val diceList: List<Dice> = listOf(FourSidedCube(), SixSidedCube(), EightSidedCube())

    for (dice in diceList) {
        dice.roll()
    }
}