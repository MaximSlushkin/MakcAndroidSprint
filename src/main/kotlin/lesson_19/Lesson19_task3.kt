package org.example.lesson_19

enum class SpaceshipStatus {
    ON_THE_GROUND,
    IN_FLIGHT,
    UNDER_FIRE,
}

class Spaceship {

    fun takeOff() {}

    fun land() {
        throw NotImplementedError()
    }

    fun shoot() {

        // TODO: Добавить логику стрельбы и выбора вида патронов
    }
}

fun main() {

    val spaceship = Spaceship()

    spaceship.takeOff()
    spaceship.shoot()
    spaceship.land()

}