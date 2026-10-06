// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: start, stop and step values required on command line")
        exitProcess(1)
    }

    val start = args[0].toDouble()
    val stop = args[1].toDouble()
    val step = args[2].toDouble()

    val term = Terminal(AnsiLevel.TRUECOLOR)

    val t = table {
        header { row("Fahrenheit", "Celsius") }
        body {
            column(0) { align = TextAlign.RIGHT }
            column(1) { align = TextAlign.RIGHT }
            var f = start
            while (f <= stop) {
                val c = (f - 32.0) * 5.0 / 9.0
                row(String.format("%.1f", f), String.format("%.1f", c))
                f += step
            }
        }
    }

    term.println(t)
}
