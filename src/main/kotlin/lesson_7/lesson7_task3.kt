package org.example.lesson_7

fun main() {

    println("Введите число для вывода четных чисел: ")

    val inputUser = readln().toInt()

    for (i in 0..inputUser step 2) {
        println(i)
    }

}