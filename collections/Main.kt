

import solarSystemSet
import solarSystemMap

enum class Difficulty { // enum class
    EASY, MEDIUM, HARD
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"
    
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress { // a singleton object
        var total: Int = 10
        var answered: Int = 3
    }
        fun printQuiz() {
            question1.let {
                println(it.questionText)
                println(it.answer)
                println(it.difficulty)
            }
            println()
            question2.let {
                println(it.questionText)
                println(it.answer)
                println(it.difficulty)
            }
            println()
            question3.let {
                println(it.questionText)
                println(it.answer)
                println(it.difficulty)
            }
            println()
    }
    
}
val Quiz.StudentProgress.progressText: String
        get() = "${answered} of ${total} answered"


data class Question<T>( // Generic class -> data class
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

// Arrays
val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars", "Pluto")
val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

val solarSystem = rockPlanets + gasPlanets

// mutable List
val newSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

// Mutable set
val solarSystemSet = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

// mutable map
val solarSystemMap = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14
)

fun main() {
    // Quiz().printProgressBar()
    // Quiz().apply { printQuiz() }
    // quiz.printQuiz()
    // println("${Quiz.answered} of ${Quiz.total} answered.")
    println(" ")
    println(solarSystemMap.size)
    solarSystemMap["Pluto"] = 5
    println(solarSystemMap.size)
    println(solarSystemMap["Pluto"])
    println(solarSystemMap.get("Pluto"))
    solarSystemMap.remove("Pluto")
    println(solarSystemMap.get("Pluto"))
    solarSystemMap["Jupiter"] = 78
    println(solarSystemMap["Jupiter"])
    /** 
    println(newSolarSystem.size)
    println(newSolarSystem[2])
    println(newSolarSystem.indexOf("Earth"))
    println(newSolarSystem.indexOf("Pluto"))


    newSolarSystem.add("Pluto")
    newSolarSystem.add(3, "Theia")
    newSolarSystem[3] = "Future Moon"

    println(newSolarSystem.get(3))
    println(newSolarSystem.get(9))
    ***/

    // set
    // println(solarSystemSet.size)
    // solarSystemSet.add("Pluto")
    // println(solarSystemSet.size)
    // println(solarSystemSet.contains("Pluto"))
    // solarSystemSet.remove("Pluto")
    // println(solarSystemSet.size)
    // println(solarSystemSet.contains("Pluto"))

    // for (planet in newSolarSystem) {
    //     println(planet)
    // }
    
    /** 
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])
    println(solarSystem[8]) **/
}