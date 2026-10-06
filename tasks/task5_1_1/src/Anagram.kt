// Task 5.1.1: anagrams() function

fun anagrams(word1: String, word2: String): Boolean {
    return word1.lowercase().toList().sorted() == word2.lowercase().toList().sorted()
}
