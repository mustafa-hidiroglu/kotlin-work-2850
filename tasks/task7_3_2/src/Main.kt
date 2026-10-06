// Task 7.3.2: safe list element access

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: integer index required on command line")
        exitProcess(1)
    }

    val planets = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    val index = args[0].toInt()

    val planet = planets.getOrNull(index)
    if (planet != null) {
        println("Planet at index $index: $planet")
    } else {
        println("Error: index $index is out of bounds")
    }
}
