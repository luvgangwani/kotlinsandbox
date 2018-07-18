fun main(args: Array<String>) {

    print("Enter a state abbreviation: ")

    val state = readLine()

    var capital = when(state) {

        "CA" -> "Sacramento"
        "OR" -> "Salem"
        else -> "Unknown"
    }

    println("The capital of ${ state } is ${ capital }")

    when(state) {

        "CA", "OR", "WA" -> {
            println("West Coast")
        }

        "NH", "VT", "MA" -> {
            println("New England")
        }

        else -> {
            println("Unknown")
        }
    }

    val guess = 45

    when(guess) {

        in 1..39 -> {
            println("No, Not Really!")
        }
        in 40..50 -> {
            println("Close Enough!")
        }
        else -> {
            println("Try Again!")
        }
    }

}