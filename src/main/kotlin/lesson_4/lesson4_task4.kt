package org.example.lesson_4

fun main() {
    val trainingDay = 5

    val isArmsAndAbsWorkout = trainingDay % 2 != 0 // Нечетные дни: руки и пресс
    val isLegsAndBackWorkout = trainingDay % 2 == 0 // Четные дни: ноги и спина

    val output = """
        Упражнения для рук:       $isArmsAndAbsWorkout
        Упражнения для ног:       ${!isLegsAndBackWorkout}
        Упражнения для спины:     false
        Упражнения для пресса:    $isArmsAndAbsWorkout
    """.trimIndent()

    println(output)
}