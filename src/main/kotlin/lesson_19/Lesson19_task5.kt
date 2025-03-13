package org.example.lesson_19

enum class Gender {
    MALE,
    FEMALE
}

class Person(val name: String, val gender: Gender)

fun main() {

    println("Введите ваши данные в формате: 'Имя Пол'. \nДоступные значения пола: MALE, FEMALE")

    val people = mutableListOf<Person>()

    repeat(5) { i ->
        println("Введите данные о человеке ${i + 1}:")
        val (name, genderData) = readln().split(" ")


        val gender = Gender.valueOf(genderData.uppercase())

        people.add(Person(name, gender))
    }

    println("Список людей по половому признаку:")
    people.forEach { person ->
        println("Имя: ${person.name}, Пол: ${person.gender}")
    }
}