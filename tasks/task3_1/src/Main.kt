// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Error: at least two arguments required")
        exitProcess(1)
    }
    println("Argument 1: ${args[0]}")
    println("Argument 2: ${args[1]}")
}
