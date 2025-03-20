package org.example.lesson_22

class RegularBook(val title: String, val author: String) {

}

data class DataBook(val title: String, val author: String) {

}

fun main() {

    val author1 = RegularBook("Утраченный символ", "Дэн Браун")
    val author2 = RegularBook("Утраченный символ", "Дэн Браун")

    val author3 = DataBook("Сияние", "Стивен Кинг")
    val author4 = DataBook("Сияние", "Стивен Кинг")

    println(author1 == author2)
//  При сравнении обычных классов оба вывода в консоль будет false.
//  Потому, что сравниваются ссылки на объекты в памяти, а не значения.

    println(author3 == author4)
//  Data класс позволяет сравнить именно проинициализированные данные. Поэтому вывод в консоль будет true.

}