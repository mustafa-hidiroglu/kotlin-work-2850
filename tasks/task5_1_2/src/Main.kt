// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: number of sides required on command line")
        exitProcess(1)
    }

    val sides = args[0].toInt()
    val roll = rollDie(sides)
    println("Rolled a $roll on a $sides-sided die")
}
