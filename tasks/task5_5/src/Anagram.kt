// Task 5.5: infix anagramOf extension function

infix fun String.anagramOf(other: String): Boolean {
    return this.lowercase().toList().sorted() == other.lowercase().toList().sorted()
}
