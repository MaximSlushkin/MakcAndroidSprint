package org.example.lesson_17

class QuizElement(question: String, answer: String) {

    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz = QuizElement("Первый элемент таблицы Менделеева?", "Водород")

    println("Вопрос: ${quiz.question}")
    println("Ответ: ${quiz.answer}")

    quiz.answer = "Алюминий"
    println("Новый ответ: ${quiz.answer}")
}