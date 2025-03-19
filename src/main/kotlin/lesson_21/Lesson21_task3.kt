package org.example.lesson_21

class PlayerV2(val userName: String, var currentHealth: Int, val maxHealth: Int) {
    fun playerStatus() {
        println("Игрок: $userName, Текущее здоровье: $currentHealth%, Максимальное здоровье: $maxHealth%")
    }
}

fun PlayerV2.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}

fun main() {

    val player = PlayerV2(userName = "Макс", currentHealth = 43, maxHealth = 100)

    player.playerStatus()

    val restoreHealth: (PlayerV2) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("${player.userName} восстановил здоровье до ${player.currentHealth}%")
    }

    if (player.isHealthy()) {
        println("Игрок полностью здоров.")
    } else {
        println("Игрок здоров не полностью.")
    }

    restoreHealth(player)

    player.playerStatus()

    if (player.isHealthy()) {
        println("Игрок полностью здоров.")
    } else {
        println("Игрок здоров не полностью.")
    }
}