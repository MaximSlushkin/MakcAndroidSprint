package org.example.lesson_20

class Robot {
    private val phrases = listOf(
        "Здравствуйте, коллеги!",
        "Что сегодня на повестке дня?",
        "Давайте за работу!",
        "Кто, где, когда?",
        "Плыли мы по морю, ветер мачту рвал..."
    )

    private var modifier: ((String) -> String)? = null
    private var currentPhrase: String? = null

    fun say() {

        if (currentPhrase == null) {
            currentPhrase = phrases.random()
        }
        val inversionPhrase = modifier?.invoke(currentPhrase!!) ?: currentPhrase
        println(inversionPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot()

    robot.say()

    robot.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot.say()
}