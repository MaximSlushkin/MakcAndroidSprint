package org.example.lesson_13

class ContactsListV2(

    var userName: String,
    val numberPhone: Long,
    val company: String? = null,
) {
    fun printContact() {

        println("-Имя: $userName \n-Номер: $numberPhone \n-Компания: $company")

    }
}

fun main() {
    println("Введите имя контакта:")
    val name = readln()

    println("Введите номер телефона:")
    val phoneInput = readLine()

    var phoneNumber: Long
    try {
        phoneNumber = phoneInput?.toLong() ?: throw NumberFormatException("Номер телефона не может быть пустым.")
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.message}")
        return
    }

    val contact = ContactsListV2(name, phoneNumber)

    contact.printContact()
}