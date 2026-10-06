// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, target: String, mask: Char = 'X'): String {
    if (target.isEmpty()) return document
    val replacement = mask.toString().repeat(target.length)
    return document.replace(target, replacement)
}
