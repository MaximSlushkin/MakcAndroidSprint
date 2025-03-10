package org.example.lesson_17

class Ship(private var _nameShip: String) {

    private var _averageSpeed: Double = 0.0
    private var _homePort: String = ""

    var nameShip: String = ""
        set(value) {
            println("Имя корабля менять нельзя!")
        }

    var averageSpeed: Double
        get() = _averageSpeed
        set(value) {
            _averageSpeed = value
        }

    var homePort: String
        get() = _homePort
        set(value) {
            _homePort = value
        }

    fun shipInfo() {
        println("Название корабля: $_nameShip \nСредняя скорость: $averageSpeed узла(ов) \nПорт приписки: $homePort")
    }

}

fun main() {

    val ship = Ship("Титаник")

    ship.averageSpeed = 23.0
    ship.homePort = "Ливерпуль"

    ship.shipInfo()

    ship.averageSpeed = 17.0
    ship.homePort = "Саутгемптон"

    ship.shipInfo()

    ship.nameShip = "Конкордия"
}