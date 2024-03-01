//Declarando valores de las respuestas
const val AFFIRMATIVE_ANSWER = "✅"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "?"

//Uniendo las respuestas con sus valores
val answers = mapOf(
  "Yes" to AFFIRMATIVE_ANSWER,
  "It's true" to AFFIRMATIVE_ANSWER,
  "Totally" to AFFIRMATIVE_ANSWER,
  "Undoubtedly" to AFFIRMATIVE_ANSWER,
  "Ask in an other moment" to DOUBTFUL_ANSWER,
  "I can't say you in this moment" to DOUBTFUL_ANSWER,
  "Maybe yes, or maybe not" to DOUBTFUL_ANSWER,
  "It's not going to happen" to NEGATIVE_ANSWER,
  "Do not count on it" to NEGATIVE_ANSWER,
  "Definitely not" to NEGATIVE_ANSWER,
  "I don't believe it" to NEGATIVE_ANSWER
)


fun main(args: Array<String>) {
  // Declarando el menu principal
  println(
    "Hello, I'm the Kotlin 8 Ball. What do you want to do?\n" +
        "1. Ask a question\n" +
        "2. Check all answers\n" +
        "3. Exit"
  )
  // Leyendo la respuesta del usuario
  val inputValue = readLine()

  // Funciones a ejecutar segÚn la respuesta del usuario
  when (inputValue) {
    "1" -> askQuestion()
    "2" -> checkAnswer()
    "3" -> exit()
    else -> showError()
  }
}

fun checkAnswer() {
  println(
    """
        Select one option:
        1. All answers
        2. Positive answers
        3. Negative answers
        4. Doubtful answers
    """.trimIndent()
  )
  val input = readLine()
  when (input) {
    "1" -> answersType(type = "ALL")
    "2" -> answersType(type = AFFIRMATIVE_ANSWER)
    "3" -> answersType(type = NEGATIVE_ANSWER)
    "4" -> answersType(type = DOUBTFUL_ANSWER)
    else -> println("Not a valid input. Goodbye.")
  }
}

fun answersType(type: String = "ALL") {
  val printAnswers: (Map<String, String>) -> Unit = {
    it.keys.forEach { answer -> println(answer) }
  }
  when (type) {
    "ALL" -> answers.keys.forEach { answer -> println(answer) }
    AFFIRMATIVE_ANSWER -> answers.filterValues { value -> value == AFFIRMATIVE_ANSWER }
      .also { printAnswers(it) }

    NEGATIVE_ANSWER -> answers.filterValues { value -> value == NEGATIVE_ANSWER }
      .also { printAnswers(it) }

    DOUBTFUL_ANSWER -> answers.filterValues { value -> value == DOUBTFUL_ANSWER }
      .also { printAnswers(it) }

    else -> println("Error, bye.")
  }
}

fun askQuestion() {
  println("What is you question?")
  readLine()
  val answer = answers.keys.random()
  println("So... that's your question... The answer is: $answer")
}

fun exit() {
  println("See you later.")
}

fun showError() {
  println("There was an error...")
}