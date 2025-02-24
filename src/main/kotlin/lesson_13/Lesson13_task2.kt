package org.example.lesson_13

class PhoneDirectoriesInfo(

    var userName: String,
    val numberPhone: Long,
    val company: String? = null,
) {
    fun printContact() {

        println("-Имя: $userName \n-Номер: $numberPhone \n-Компания: $company")

    }
}

fun main() {

    val contact = PhoneDirectoriesInfo(

        userName = "Ростислав",
        numberPhone = 89123456789,
        company = "<не указано>"

    )
    println(contact.printContact())

}