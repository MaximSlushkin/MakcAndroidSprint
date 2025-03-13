package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var typeOfCharge: Ammo? = null

    fun equip(ammo: Ammo) {
        typeOfCharge = ammo
        println("Танк вооружен патронами цвета ${ammo.name}.")
    }

    fun shoot() {
        if (typeOfCharge == null) {
            println("Танк не заряжен!")
        } else {
            typeOfCharge?.let { ammo ->
                println("Выстрел произведён! Нанесенный урон: ${ammo.damage} единиц.")
            }
        }
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.equip(Ammo.BLUE)
    tank.shoot()

    tank.equip(Ammo.GREEN)
    tank.shoot()

    tank.equip(Ammo.RED)
    tank.shoot()
}