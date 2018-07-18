fun main(args: Array<String>) {

    var colors = arrayOf("Red", "Green", "Blue")
    var values = intArrayOf(1, 3, 5, 7, 9)

    printHeader("For each loop")
    for(color in colors) {
        println(color)
    }

    for(value in values) {
        println(value)
    }

    printHeader("For loop with indices")

    for(i in values.indices) {
        println(values[i])
    }

    printHeader("For loop with step")

    for(i in values.indices step 2) {
        println(values[i])
    }

    printHeader("For loop for a range of values")

    for (i in 0..colors.size-1) { // or 0 until colors.size
        println(colors[i])
    }
}

fun printHeader(label: String) {

    println("********")
    println(label)
    println("********")
}