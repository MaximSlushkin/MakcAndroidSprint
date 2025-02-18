package org.example.lesson_11

class User(
    val id: Int,
    val userName: String,
    val userPassword: String,
    val userEmail: String,

    ) {

}

fun main() {

    val user1: User = User(
        id = 1,
        userName = "MaxSlushkin",
        userPassword = "fFgkgfFff",
        userEmail = "maxslushkin@mai.ru",
    )

    val user2: User = User(
        id = 2,
        userName = "BogdanSlushkin",
        userPassword = "ssdsdwwwe",
        userEmail = "bogdanslushkin@mai.ru"
    )

    println(user1.id)
    println(user1.userName)
    println(user1.userPassword)

    println()

    println(user2.id)
    println(user2.userName)
    println(user2.userPassword)

}
