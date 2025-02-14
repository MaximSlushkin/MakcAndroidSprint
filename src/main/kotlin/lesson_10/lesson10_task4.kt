package org.example.lesson_10

fun main() {
    var playerWins = 0
    var continueGame: String

    do {
        val (playerRoll, computerRoll) = playRound()

        println("Игрок бросил кубики и получил: $playerRoll")
        println("Компьютер бросил кубики и получил: $computerRoll")

        when {
            playerRoll > computerRoll -> {
                println("Победило человечество!")
                playerWins++ // Увеличение счетчика побед игрока
            }

            computerRoll > playerRoll -> println("Победила машина!")
            else -> println("Победила дружба!")
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет:")
        continueGame = readln().trim().lowercase()
    } while (continueGame == "да")

    println("Спасибо за игру! Вы выиграли $playerWins раз(а).")
}

fun rollDice(): Int {
    return (1..6).random()
}

fun playRound(): Pair<Int, Int> {
    val playerRoll = rollDice()
    val computerRoll = rollDice()
    return Pair(playerRoll, computerRoll)
}