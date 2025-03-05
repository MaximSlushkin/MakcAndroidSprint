package org.example.lesson_14

open class Message(
    val id: Int,
    val text: String,
    val author: String,

    )

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageID: Int,
) : Message(id, text, author)

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        val message = Message(nextId, text, author)
        messages.add(message)
        nextId++
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        val message = ChildMessage(nextId, text, author, parentMessageId)
        messages.add(message)
        nextId++
    }

    fun printChat() {

        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageID else null
        }

        val parentMessages = groupedMessages[null] ?: emptyList()

        for (message in parentMessages) {
            println("${message.author}: ${message.text}")

            val childMessages = groupedMessages[message.id] ?: emptyList()
            for (childMessage in childMessages) {
                println("\t${childMessage.author}: ${childMessage.text}")
            }
        }
    }
}

    fun main() {

        val chat = Chat()

        chat.addMessage("Здравствуйте коллеги!", "Директор")
        chat.addMessage("Все ли задачи выполнены?", "Зам.Ген.Директора")

        chat.addThreadMessage(1, "Здравствуйте, Максим Александрович!", "Аделя")
        chat.addThreadMessage(1, "Приветствуем Вас!", "Богдан")
        chat.addThreadMessage(2, "К вечеру всё будет готово", "Дарья.ТимЛид")
        chat.addThreadMessage(2, "Благодарю за слаженность в работе!", "Директор")

        chat.printChat()
    }