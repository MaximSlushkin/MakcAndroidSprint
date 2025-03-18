package org.example.lesson_20

class Player(val userName: String, var currentHealth: Int, val maxHealth: Int) {
    fun playerStatus() {
        println("Игрок: $userName, Текущее здоровье: $currentHealth, Максимальное здоровье: $maxHealth")
    }
}

fun main() {

    val player = Player(userName = "Макс", currentHealth = 43, maxHealth = 100)

    player.playerStatus()

    val restoreHealth: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("${player.userName} восстановил здоровье до ${player.currentHealth}!")
    }

    restoreHealth(player)

    player.playerStatus()
}