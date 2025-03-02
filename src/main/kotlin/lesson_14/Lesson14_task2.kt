package org.example.lesson_14

open class CruiseShip(
    var name: String = "Лайнер",
    var passengerCapacity: Int = 200,
    var speed: Double = 30.0,
    var loadingMethod: String = "Способ погрузки",

    ) {
    open fun loadingMethod() {
        println("$loadingMethod: выдвигает горизонтальный трап со шкафута для посадки пассажиров.")
    }

    open fun info() {
        println("Корабль: $name")
        println("Вместимость: $passengerCapacity пассажиров")
        println("Скорость: $speed узлов")
    }
}

class Freighter(
    name: String = "Грузовой корабль",
    passengerCapacity: Int = 100,
    speed: Double = 20.0,
    var cargoCapacity: Double = 1000.0,
) : CruiseShip(name, passengerCapacity, speed) {

    override fun loadingMethod() {
        println("$loadingMethod: активирует погрузочный кран для загрузки груза.")
    }

    override fun info() {
        super.info()
        println("Грузоподъемность: $cargoCapacity тонн")
    }
}

class IcebreakerShip(
    name: String = "Ледокол",
    passengerCapacity: Int = 50,
    speed: Double = 15.0,
) : CruiseShip(name, passengerCapacity, speed) {

    override fun loadingMethod() {
        println("$loadingMethod: открывает ворота со стороны кормы для погрузки/разгрузки.")
    }

    override fun info() {
        super.info()
        println("Этот корабль может колоть лёд.")
    }
}

fun main() {
    val cruiseShip = CruiseShip()
    val cargoShip = Freighter()
    val icebreaker = IcebreakerShip()

    println("Информация о кораблях:")

    cruiseShip.info()
    cruiseShip.loadingMethod()
    println()

    cargoShip.info()
    cargoShip.loadingMethod()
    println()

    icebreaker.info()
    icebreaker.loadingMethod()
}