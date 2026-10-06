// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: filename required on command line")
        exitProcess(1)
    }

    val path = Path(args[0])
    val lines = path.readLines()

    var longestLineNum = 1
    var maxLength = -1

    for ((index, line) in lines.withIndex()) {
        if (line.length > maxLength) {
            maxLength = line.length
            longestLineNum = index + 1
        }
    }

    println("Line $longestLineNum is the longest (length = $maxLength)")
}
