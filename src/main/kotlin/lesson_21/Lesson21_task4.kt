package org.example.lesson_21

import java.io.File

fun File.writeWordToStart(word: String) {

    val lowerCaseWord = word.lowercase()

    if (this.exists()) {

        val currentContent = this.readText()

        this.writeText("$lowerCaseWord\n$currentContent")
    } else {

        this.writeText("$lowerCaseWord\n")
    }
}

fun main() {

    val file = File("words.txt")


    file.writeWordToStart("Привет")
    file.writeWordToStart("Мир")

    val fileContent = file.readText()
    println(fileContent)
}