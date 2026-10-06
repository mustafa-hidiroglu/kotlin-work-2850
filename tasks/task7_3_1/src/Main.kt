// Task 7.3.1: list element access

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: integer index required on command line")
        exitProcess(1)
    }

    val planets = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    val index = args[0].toInt()

    println("Planet at index $index: ${planets[index]}")
}
