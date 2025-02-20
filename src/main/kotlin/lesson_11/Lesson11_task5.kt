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
) {
    val usersList: MutableList<UserForum> = mutableListOf<UserForum>()
    val messagesList: MutableList<ForumMessage> = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String) {
        val newUser = UserForum(usersList.size + 1, userName)
        usersList.add(newUser)
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

    forum.createNewMessage(forum.usersList[0].userId, "Привет, Bogdan!")
    forum.createNewMessage(forum.usersList[1].userId, "Привет Max!");
    forum.createNewMessage(forum.usersList[0].userId, "Как дела?");
    forum.createNewMessage(forum.usersList[1].userId, "Всё отлично. Как ты?");

    println("Сообщения на форуме:")
    forum.printAllMessage()
}
