package org.example.lesson_13

class Contacts(

    var userName: String,
    val numberPhone: Long,
    val company: String? = null,
) {
    fun printContact() {

        println("-Имя: $userName \n-Номер: $numberPhone \n-Компания: $company")

    }
}

fun main() {

    val contacts = listOf(
        Contacts("Ростислав", 89123345389, "Магнит"),
        Contacts("Макс", 891234345789, null),
        Contacts("Богдан", 89123456789, "Перекресток"),
        Contacts("Аделя", 8233456789, "null"),
        Contacts("Дарья", 89123456734, null),
    )
    val companies = mutableSetOf<String>()

    for (contact in contacts) {
        if (contact.company != null) {
            companies.add(contact.company)
        }

    }

    println("Список компаний в телефонной книге:")
    for (company in companies) {
        println(company)
    }
}