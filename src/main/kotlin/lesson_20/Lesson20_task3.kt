package org.example.lesson_20

class Gamer(val name: String, var key: Boolean) {
}

fun main() {

    val playerKey = Gamer(name = "Макс", key = true)

    val openDoor: (Gamer) -> String = { player ->
        if (player.key) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    println(openDoor(playerKey))

    playerKey.key = false
    println(openDoor(playerKey))

}