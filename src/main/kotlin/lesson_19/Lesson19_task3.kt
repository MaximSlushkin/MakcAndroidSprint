package org.example.lesson_19

enum class SpaceshipStatus {
    ON_THE_GROUND,
    IN_FLIGHT,
    UNDER_FIRE,
}

class Spaceship {
    var status: SpaceshipStatus = SpaceshipStatus.ON_THE_GROUND

    fun takeOff() {

        status = SpaceshipStatus.IN_FLIGHT
        println("Космический корабль взлетает!")
    }

    fun land() {

        status = SpaceshipStatus.ON_THE_GROUND
        println("Космический корабль приземляется!")
    }

    fun shoot() {
        status = SpaceshipStatus.UNDER_FIRE

        println("Космический корабль отстреливается от астероида!")

    }
}

fun main() {

    val spaceship = Spaceship()

    spaceship.takeOff()
    spaceship.shoot()
    spaceship.land()

}