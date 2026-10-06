// Task 7.7.1: data handling functions

import kotlin.io.path.Path
import kotlin.io.path.readLines

fun readData(filename: String): List<Double> {
    return Path(filename).readLines()
        .map { it.trim() }
        .filter { it.isNotEmpty() }
        .map { it.toDouble() }
}
