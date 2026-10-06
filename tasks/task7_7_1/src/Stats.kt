// Task 7.7.1: statistics functions

fun median(data: List<Double>): Double {
    require(data.isNotEmpty()) { "Cannot compute median of empty list" }
    val sorted = data.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 1) {
        sorted[mid]
    } else {
        (sorted[mid - 1] + sorted[mid]) / 2.0
    }
}

fun displayStats(data: List<Double>) {
    println("Count: ${data.size}")
    println("Min: ${data.minOrNull()}")
    println("Max: ${data.maxOrNull()}")
    println("Mean: ${"%.2f".format(data.average())}")
    println("Median: ${"%.2f".format(median(data))}")
}
