package org.example.lesson_17

class Folders(private val name: String, private var numberOfFiles: Int, private val levelSecrecy: Boolean) {

    val nameFolder: String
        get() = if (levelSecrecy) "Скрытая папка" else name

    val filesCount: Int
        get() = if (levelSecrecy) 0 else numberOfFiles
}

fun main() {

    val secretFolder = Folders("Гриф: Секретно", 7, true)
    println("Название папки: ${secretFolder.nameFolder} \nКоличество файлов: ${secretFolder.filesCount}")

    println()

    val regularFolder = Folders("Обычные документы", 5, false)
    println("Название папки: ${regularFolder.nameFolder} \nКоличество файлов: ${regularFolder.filesCount}")

}