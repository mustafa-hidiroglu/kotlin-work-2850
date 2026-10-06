// Task 5.4.1: main program

fun main() {
    val shortString = "Hello"
    val mediumString = "12345678901234567890"
    val longString = "This is a very long string with more than 20 characters"

    println("\"$shortString\" is too long? ${shortString.isTooLong()}")
    println("\"$mediumString\" is too long? ${mediumString.isTooLong()}")
    println("\"$longString\" is too long? ${longString.isTooLong()}")
}
