package org.example.lesson_20

fun main() {

    val elementsList =
        listOf("Первый", "Второй", "Третий", "Четвертый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый")

    val actions: List<() -> Unit> = elementsList.map { element ->
        { println("Нажат элемент: $element.") }
    }

    for (i in actions.indices) {
        if (i % 2 == 1) {
            actions[i]()
        }
    }
}