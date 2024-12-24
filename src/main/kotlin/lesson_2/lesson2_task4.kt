package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    var percentageOfProduction = 20
    var buffMultiplier = percentageOfProduction / TOTAL_PERCENTAGE
    val bonusCrystal = (crystalOre * buffMultiplier).toInt()
    val bonusIron = (ironOre * buffMultiplier).toInt()

    println("Бонус кристаллической руды: $bonusCrystal")
    println("Бонус железной руды: $bonusIron")
}

const val TOTAL_PERCENTAGE = 100