package org.example.lesson_15

interface TransportVehicle {
    fun drive()
}

interface PassengerTransport {
    fun loadPassenger(): Boolean
    fun unloadPassenger(): Boolean
}

interface CargoTransport {
    fun loadCargo(weight: Double): Boolean
    fun unloadCargo(): Double
}

class CargoCar(val maxCargo: Double) : TransportVehicle, PassengerTransport, CargoTransport {
    private var currentPassengers = 0
    private var currentCargo = 0.0

    override fun drive() {
        println("Грузовик выехал.")
    }

    override fun loadPassenger(): Boolean {
        return if (currentPassengers < 1) {
            currentPassengers++
            println("Грузовик загрузил 1 пассажира.")
            true
        } else {
            println("Грузовик уже полон пассажирами!")
            false
        }
    }

    override fun unloadPassenger(): Boolean {
        return if (currentPassengers > 0) {
            currentPassengers--
            println("Грузовик выгрузил 1 пассажира.")
            true
        } else {
            println("В грузовике нет пассажиров для выгрузки.")
            false
        }
    }

    override fun loadCargo(weight: Double): Boolean {
        return if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Грузовик загрузил $weight тонн груза.")
            true
        } else {
            println("Грузовик не может загрузить $weight тонн. Мало места!")
            false
        }
    }

    override fun unloadCargo(): Double {
        val cargoUnloaded = currentCargo
        currentCargo = 0.0
        println("Грузовик разгрузил $cargoUnloaded тонн груза.")
        return cargoUnloaded
    }
}

class PassengerCar(val maxPassengers: Int) : TransportVehicle, PassengerTransport {
    var currentPassengers = 0

    override fun drive() {
        println("Легковой автомобиль выехал.")
    }

    override fun loadPassenger(): Boolean {
        return if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Легковой автомобиль загрузил 1 пассажира.")
            true
        } else {
            println("Легковой автомобиль уже полон пассажирами!")
            false
        }
    }

    override fun unloadPassenger(): Boolean {
        return if (currentPassengers > 0) {
            currentPassengers--
            println("Легковой автомобиль выгрузил 1 пассажира.")
            true
        } else {
            println("В легковом автомобиле нет пассажиров для выгрузки.")
            false
        }
    }
}

fun main() {

    val truck = CargoCar(2.0)
    val passengerСar = PassengerCar(3)

    println("Перевозим 6 пассажиров и 2 тонны груза:")

    for (i in 1..3) {
        passengerСar.loadPassenger()
    }

    truck.loadPassenger()
    truck.loadCargo(2.0)
    passengerСar.drive()
    truck.drive()
    passengerСar.unloadPassenger()
    truck.unloadPassenger()
    truck.unloadCargo()
}