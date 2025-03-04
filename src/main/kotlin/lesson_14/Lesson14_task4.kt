package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val suitableForLanding: Boolean
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding) {

    val satellites: MutableList<Satellite> = mutableListOf()

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

fun main() {

    val planet = Planet("Марс", true, true)

    val firstSatellite = Satellite("Фобос", false, false)
    val secondSatellite = Satellite("Деймос", false, false)

    planet.addSatellite(firstSatellite)
    planet.addSatellite(secondSatellite)

    println("Планета: ${planet.name}")

    val satellitesNames = planet.satellites.joinToString() { it.name }
    println("Спутники: $satellitesNames")
}