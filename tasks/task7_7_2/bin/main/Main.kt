// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    val db = createDatabase()
    db.load(CSV_FILENAME)

    println("Phone Book (${db.size} entries loaded)")
    while (true) {
        print("\nEnter command [lookup/add/list/quit]: ")
        val input = readlnOrNull()?.trim() ?: break
        when (input.lowercase()) {
            "lookup" -> {
                print("Enter name: ")
                val name = readlnOrNull()?.trim() ?: ""
                val number = db[name]
                if (number != null) {
                    println("$name: $number")
                } else {
                    println("Not found: $name")
                }
            }
            "add" -> {
                print("Enter name: ")
                val name = readlnOrNull()?.trim() ?: ""
                print("Enter number: ")
                val number = readlnOrNull()?.trim() ?: ""
                if (name.isNotEmpty() && number.isNotEmpty()) {
                    db[name] = number
                    println("Added $name: $number")
                }
            }
            "list" -> {
                if (db.isEmpty()) {
                    println("Phone book is empty")
                } else {
                    for ((name, number) in db.toSortedMap()) {
                        println("$name: $number")
                    }
                }
            }
            "quit", "q", "exit" -> {
                db.save(CSV_FILENAME)
                println("Saved and exiting.")
                break
            }
            else -> {
                println("Unknown command: $input")
            }
        }
    }
}
