// Task 7.7.1: program to compute stats for a numeric dataset

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: filename required on command line")
        exitProcess(1)
    }

    val data = readData(args[0])
    displayStats(data)
}
