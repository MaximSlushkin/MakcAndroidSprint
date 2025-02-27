package org.example.lesson_14

open class Liner(
    var name: String = "Лайнер",
    var passengerCapacity: Int = 200,
    var speed: Double = 30.0,
) {
    open fun shipInfo() {
        println("Корабль: $name")
        println("Вместимость: $passengerCapacity пассажиров")
        println("Скорость: $speed узлов")
    }
}

class CargoShip(
    name: String = "Грузовой корабль",
    passengerCapacity: Int = 100,
    speed: Double = 20.0,
    var cargoCapacity: Double = 1000.0,
) : Liner(name, passengerCapacity, speed) {

    override fun shipInfo() {
        super.shipInfo()
        println("Грузоподъемность: $cargoCapacity тонн")
    }
}

class Icebreaker(
    name: String = "Ледокол",
    passengerCapacity: Int = 50,
    speed: Double = 15.0,
) : Liner(name, passengerCapacity, speed) {


    override fun shipInfo() {
        super.shipInfo()
        println("Этот корабль может колоть лёд.")
    }
}

fun main() {
    val linerShip = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    println("Информация о кораблях:")
    linerShip.shipInfo()
    println()
    cargoShip.shipInfo()
    println()
    icebreaker.shipInfo()
}