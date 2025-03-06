package org.example.lesson_15

abstract class Users(val username: String) {

    fun readForum() {
        println("$username читает форум.")
    }

    abstract fun writeMessage(message: String)
}

class RegularUser(username: String) : Users(username) {

    override fun writeMessage(message: String) {
        println("$username написал сообщение: $message")
    }
}

class Administrator(username: String) : Users(username) {

    override fun writeMessage(message: String) {
        println("$username (администратор) написал сообщение: $message")
    }

    fun deleteMessage(message: String) {
        println("$username удалил сообщение: $message")
    }

    fun deleteUser(user: RegularUser) {
        println("$username удалил пользователя: ${user.username}")
    }
}

fun main() {

    val user = RegularUser("Макс")
    val admin = Administrator("Аделя")

    user.readForum()
    user.writeMessage("Привет коллеги!")

    admin.readForum()
    admin.writeMessage("Добро пожаловать в наше сообщество!")
    admin.deleteMessage("Привет коллеги!")
    admin.deleteUser(user)
}