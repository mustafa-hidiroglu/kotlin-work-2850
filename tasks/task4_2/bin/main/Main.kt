// Task 4.2: use of if and ranges

fun main() {
    println("Pizza Menu:")
    println("a) Margherita")
    println("b) Pepperoni")
    println("c) Vegetarian")
    println("d) Hawaiian")
    print("Please select an option (a-d): ")

    val input = readln().lowercase()

    if (input.length == 1 && input[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }
}
