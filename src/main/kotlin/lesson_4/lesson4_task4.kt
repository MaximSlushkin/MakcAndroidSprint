package org.example.lesson_4

fun main() {
    val trainingDay = 5

    val isLegsAndBackWorkout = trainingDay % 2 == 0

    val output = """
        Упражнения для рук:       ${!isLegsAndBackWorkout}
        Упражнения для пресса:    ${!isLegsAndBackWorkout}
        Упражнения для ног:       ${isLegsAndBackWorkout}
        Упражнения для спины:     ${isLegsAndBackWorkout}
       
    """.trimIndent()

    println(output)
}
