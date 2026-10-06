// Task 5.2.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: radius required on command line")
        exitProcess(1)
    }

    val radius = args[0].toDouble()
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    println("Area = %.4f".format(area))
    println("Perimeter = %.4f".format(perimeter))
}
