package org.example.lesson_11

class UserForum(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum(
    val usersList: MutableList<UserForum> = mutableListOf<UserForum>(),
    val messagesList: MutableList<ForumMessage> = mutableListOf<ForumMessage>(),
    var userIdCounter: Int = 1,
) {

    fun createNewUser(userName: String): UserForum {
        val newUser = UserForum(userIdCounter++, userName)
        usersList.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String) {

        if (usersList.any { it.userId == authorId }) {
            messagesList.add(ForumMessage(authorId, message))
        }
    }

    fun printAllMessage() {
        for (msg in messagesList) {
            val author = usersList.find { it.userId == msg.authorId }
            println("${author?.userName}: ${msg.message}")
        }
    }
}

fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Max")
    val user2 = forum.createNewUser("Bogdan")

    forum.createNewMessage(user1.userId, "Привет, Bogdan!")
    forum.createNewMessage(user2.userId, "Привет Max!");
    forum.createNewMessage(user1.userId, "Как дела?");
    forum.createNewMessage(user2.userId, "Всё отлично. Как ты?");

    println("Сообщения на форуме:")
    forum.printAllMessage()
}
