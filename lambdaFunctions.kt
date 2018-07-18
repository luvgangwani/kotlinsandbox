fun main(args: Array<String>) {
    val helloWorld  = {
        println("Hello World!")
    }

    helloWorld()
    helloWorld.invoke()

    val sayHello = {
        user: String, age: Int -> println("Hello ${ user } age is ${ age }")
    }

    sayHello("David", 45)

    println("-------------------------------------------------------------")

    val states = arrayOf("New York", "New Jersey", "New Hampshire", "Vermont", "Rhode Island", "Nebraska")

//    val sorted = states.sortedBy{ state -> state.length }

    val sorted = states.sortedBy{ it.length }
            .filter { it.startsWith("n", true ) }

    for(state in sorted){
        println(state)
    }
}