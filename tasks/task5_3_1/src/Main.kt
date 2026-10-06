// Task 5.3.1: main program

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        val roll = rollDie()
        println("Rolled a $roll on a 6-sided die")
    } else {
        val sides = args[0].toInt()
        val roll = rollDie(sides)
        println("Rolled a $roll on a $sides-sided die")
    }
}
