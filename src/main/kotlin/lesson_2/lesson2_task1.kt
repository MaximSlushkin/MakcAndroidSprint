package org.example.lesson_2

//Задача 1 к Уроку 2
//
//Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
//У них следующие баллы по профильному предмету 3, 4, 3, 5.
//Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.
//
//– Написать выражение, которое высчитывает средний балл;
//– Распечатать результат в консоль;
//– В консоли должно быть выведено дробное число с 2 знаками после запятой.

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