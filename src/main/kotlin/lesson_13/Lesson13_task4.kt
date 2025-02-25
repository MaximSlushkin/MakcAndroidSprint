package org.example.lesson_13

class ContactsList(

    var userName: String,
    val numberPhone: Long,
    val company: String? = null,
) {
    fun printContact() {

        println("-Имя: $userName \n-Номер: $numberPhone \n-Компания: $company")

    }
}

fun main() {

    val contacts = mutableListOf<ContactsList>()

    while (true) {
        println("Введите имя контакта или \"exit\" для завершения:")

        val name = readLine() ?: break
        if (name.lowercase() == "exit") break

        println("Введите номер телефона:")
        val phoneInput = readLine() ?: continue

        val phoneNumber = phoneInput.toLongOrNull()
        if (phoneNumber == null) {
            println("Номер телефона введен некорректно. Попробуйте еще раз.")
            break
        }

        println("Введите компанию:")
        val companyInput = readln()
        val company = companyInput

        val newContact = ContactsList(name, phoneNumber, company)
        contacts.add(newContact)
    }

    println("Список контактов в телефонной книге:")
    for (contact in contacts) {
        contact.printContact()
    }
}
