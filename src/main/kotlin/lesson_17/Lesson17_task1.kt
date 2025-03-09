package org.example.lesson_17

class QuizElement(val question: String, private var answer: String) {

    val questionText: String
        get() = question

    var answerText: String
        get() = answer
        set(value) {
            answer = value
        }
}

fun main() {

    val qiuz = QuizElement("Первый элемент таблицы Менделеева?", "Водород")

    println("Вопрос: ${qiuz.questionText}")
    println("Ответ: ${qiuz.answerText}")

    qiuz.answerText = "Алюминий"
    println("Новый ответ: ${qiuz.answerText}")

}