// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: integer limit required on command line")
        exitProcess(1)
    }

    val limit = args[0].toLong()
    var sum = 0L

    for (i in 1L..limit step 2) {
        sum += i
    }

    println("Sum of odd integers up to $limit: $sum")
}
