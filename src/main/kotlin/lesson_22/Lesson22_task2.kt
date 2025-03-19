package org.example.lesson_22

class RegularBookV2(val title: String, val author: String) {

}

data class DataBookV2(val title: String, val author: String) {

}

fun main() {

    val author1 = RegularBookV2("Утраченный символ", "Дэн Браун")

    val author2 = DataBookV2("Сияние", "Стивен Кинг")

    println(author1)
    // Вывод: org.example.lesson_22.RegularBookV2@52cc8049 - Так выглядит строковое представление объекта по умолчанию,
    // потому что обычный класс не переопределяет методы автоматически

    println(author2) // Вывод: DataBookV2(title=Сияние, author=Стивен Кинг)-
// - В Data-классе автоматически вызывается сгенерированный метод toString(), отображающий значения свойств

}