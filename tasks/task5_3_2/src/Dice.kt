// Task 5.3.2: rollDice() function

fun rollDice(count: Int = 1, sides: Int = 6): List<Int> {
    return List(count) { (1..sides).random() }
}
