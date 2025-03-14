package org.example.lesson_19

enum class Fish(val nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {

    println("Эти виды рыб вы можете добавить в свой аквариум:")

    for (fish in Fish.entries) {
        println(fish.nameFish)
    }
}