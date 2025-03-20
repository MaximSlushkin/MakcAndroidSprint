package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая к Солнцу звёздная система.",
        eventDateTime = LocalDateTime.now(),
        distanceFromEarth = 4.367
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val eventDateTime = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()

    println("Название: $name")
    println("Описание: $description")
    println("Дата и время события: $eventDateTime")
    println("Расстояние от Земли: $distanceFromEarth световых лет")
}