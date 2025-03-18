package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {

    if (this.isEmpty()) return null

    return this.maxByOrNull { it.value }?.key
}

fun main() {

    val skills = mapOf(
        "Стрельба" to 300,
        "Бег" to 200,
        "Плавание" to 150,
        "Сила" to 300
    )

    val maxSkill = skills.maxCategory()

    println("Навык с наибольшим количеством очков опыта: $maxSkill")
}