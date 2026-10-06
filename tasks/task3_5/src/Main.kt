// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val file = Path("test.txt")
    file.writeText("Line 1\n")
    file.appendText("Line 2\n")
    val content = file.readText()
    print(content)
}
