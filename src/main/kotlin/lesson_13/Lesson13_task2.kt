package org.example.lesson_13

class PhoneDirectoriesInfo(

    var userName: String,
    val numberPhone: Long,
    val company: String? = null,
) {
    fun printContact() {

        println("-Имя: $userName \n-Номер: $numberPhone \n-Компания: ${company ?: "<не указано>"}")

    }
}

fun main() {

    val contact = PhoneDirectoriesInfo(

        userName = "Ростислав",
        numberPhone = 89123456789,

        )
    println(contact.printContact())

}