package org.example.lesson_22
//В Путеводитель для путешествующих автостопом по Галактике добавляется информация о месте или событии в галактике в виде объектов.
//
//Создай data class GalacticGuide cо свойствами:
//
//- название места или события;
//- описание места или события;
//- дата и время события;
//- расстояние места или события от Земли в световых годах.
//
//Создай объект с информацией о звездной системе Alpha Centauri. Выведи информацию о месте, используя компонентные функции data class.

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