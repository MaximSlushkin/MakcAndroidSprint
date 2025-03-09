package org.example.lesson_17

class QuizElement(private val _question: String, private var _answer: String) {

    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}

fun main() {

    val qiuz = QuizElement("Первый элемент таблицы Менделеева?", "Водород")

    println("Вопрос: ${qiuz.question}")
    println("Ответ: ${qiuz.answer}")

    qiuz.answer = "Алюминий"
    println("Новый ответ: ${qiuz.answer}")

}