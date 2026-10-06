// Task 5.3.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: dice specification required on command line (e.g., 3d6)")
        exitProcess(1)
    }

    val spec = args[0]
    val parts = spec.split('d')
    if (parts.size != 2) {
        println("Error: invalid dice specification format")
        exitProcess(1)
    }

    val count = parts[0].toInt()
    val sides = parts[1].toInt()

    val rolls = rollDice(count, sides)
    println("Rolling $spec: $rolls (Total: ${rolls.sum()})")
}
