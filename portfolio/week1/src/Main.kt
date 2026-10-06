// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun compute_s(a: Double, b: Double, c: Double): Double {
    return (a+b+c)/2.0
}

fun compute_area(s: Double, a: Double, b: Double, c: Double): Double {
    return sqrt(s * (s-a) * (s-b) * (s-c))
}

fun main(args: Array<String>) {
    if (args.size < 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    val s = compute_s(a, b, c)

    val area = compute_area(s, a, b, c)

    println("Area = %.5f".format(area))
}