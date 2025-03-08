package org.example.lesson_16

// Класс Player
class Player(val name: String, var health: Int, var attackPower: Int) {

    // Метод для получения урона
    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
            println("$name получает $damage урона. Текущее здоровье: $health")

            // Проверяем, не закончилась ли жизнь
            if (health <= 0) {
                die() // Вызываем метод для обработки смерти
            }
        } else {
            println("$name уже мёртв и не может получать урон!")
        }
    }

    // Метод для лечения
    fun heal(amount: Int) {
        if (health > 0) {
            health += amount
            println("$name лечится на $amount. Текущее здоровье: $health")
        } else {
            println("$name не может лечиться, он мёртв!")
        }
    }

    // Приватный метод, который вызывается при смерти
    private fun die() {
        println("$name умирает!")
        attackPower = 0 // Обнуляем силу удара
        health = 0 // Здоровье обнуляется
    }
}

// Точка входа в программу
fun main() {
    // Создаем игрока
    val player = Player(name = "Герой", health = 100, attackPower = 20)

    // Симулируем бой
    player.takeDamage(30) // Игрок получает урон
    player.heal(20)       // Игрок лечится

    player.takeDamage(90) // Игрок получает урон, что приводит к смерти
    player.heal(10)       // Попытка вылечиться после смерти
}