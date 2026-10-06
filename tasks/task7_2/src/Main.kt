// Task 7.2: array comparison

fun main() {
    val a = arrayOf(1, 2, 3)
    val b = arrayOf(1, 2, 3)
    val c = a

    println("a == b: ${a == b}")
    println("a === b: ${a === b}")
    println("a === c: ${a === c}")
    println("a.contentEquals(b): ${a.contentEquals(b)}")
}
