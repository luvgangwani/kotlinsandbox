fun main(args: Array<String>) {

    val states = arrayOf("CA", "OR", "WA")

    printHeaderAgain("While Loop")
    var counter = 0

    while(counter < states.size) {
        println(states[counter])
        counter++
    }

    printHeaderAgain("Do While Loop")
    counter = 0

    do {
        println(states[counter])
        counter++
    } while (counter < states.size)
    
}

fun printHeaderAgain(label: String) {

    println("********")
    println(label)
    println("********")
}
