package org.example.lesson_2



fun main () {

    val students: Int = 4
    val markStudent1: Int = 3
    val markStudent2: Int = 4
    val markStudent3: Int = 3
    val markStudent4: Int = 5

    val averageScore: Double =
    (markStudent1.toDouble() + markStudent2.toDouble() + markStudent3.toDouble() + markStudent4).toDouble() / students.toDouble()
    println(averageScore)

}