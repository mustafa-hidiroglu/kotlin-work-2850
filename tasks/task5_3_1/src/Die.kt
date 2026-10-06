// Task 5.3.1: rollDie() with default argument

fun rollDie(sides: Int = 6): Int {
    return (1..sides).random()
}
