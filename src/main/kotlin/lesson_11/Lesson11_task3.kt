package org.example.lesson_11

class Participant(
    val nickname: String,
    var status: String,
    val avatar: String,
)

class Room(
    val roomCover: String,
    val roomName: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
        println("${participant.nickname} был добавлен в комнату \"$roomName\".")
    }

    fun updateStatus(nickname: String, newStatus: String) {
        val participant = participants.find { it.nickname == nickname }
        if (participant != null) {
            participant.status = newStatus
            println("Статус участника комнаты \"$nickname\" обновлён на: $newStatus.")
        }
    }

    fun displayRoomInfo() {
        println("Комната: $roomName")
        println("Обложка: $roomCover")
        println("Участники:")
        participants.forEach { participant ->
            println("- ${participant.nickname}: ${participant.status} (аватар: ${participant.avatar})")
        }
    }
}

fun main() {

    val participant1 = Participant("Maxim", "разговаривает", "avatar1.jpg")
    val participant2 = Participant("Bogdan", "микрофон выключен", "avatar2.jpg")
    val participant3 = Participant("Anna", "пользователь заглушен", "avatar3.jpg")

    val room = Room(
        roomCover = "room_cover.jpg",
        roomName = "Kotlin разработчики",
    )

    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.addParticipant(participant3)

    room.displayRoomInfo()

    room.updateStatus("Maxim", "микрофон выключен")
    room.updateStatus("Bogdan", "пользователь заглушен")
    room.updateStatus("Anna", "разговаривает")

    println("Обновленная информация о комнате:")
    room.displayRoomInfo()
}