// Task 4.3: grade calculation using a when expression

import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: three marks required on command line")
        exitProcess(1)
    }

    val marks = args.map { it.toDouble() }
    val average = marks.average().roundToInt()

    val grade = when (average) {
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        in 0..39 -> "Fail"
        else -> "Invalid"
    }

    println("Average: $average, Grade: $grade")
}
