package org.example.lesson_17

class Parcel(val trackingNumber: String, private var moveCount: Int = 0) {

    var location: String = "Склад Алёхино"
        set(value) {
            field = value
            moveCount++
        }

    fun parcelInfo() {
        println("Номер посылки: $trackingNumber \nТекущее местоположение: $location \nКоличество перемещений: $moveCount")
    }
}

fun main() {

    val parcel = Parcel("777666123")

    parcel.parcelInfo()

    println()

    parcel.location = "Склад Шушары"
    parcel.parcelInfo()

    println()

    parcel.location = "Склад Казань"
    parcel.parcelInfo()
}