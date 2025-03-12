package org.example.lesson_18

open class Animals(val name: String) {
    open fun eat() {
        println("$name -> ест")
    }

    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animals(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animals(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animals(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {

    val animals: List<Animals> = listOf(Fox("Лиса"), Dog("Собака"), Cat("Кошка"))

    for (animal in animals) {
        animal.eat()
    }
}