fun main(args: Array<String>) {

    println("--------------------------------------")

//    Immutable List

    val listOfNumbers = listOf("One",2,3,"Four")
    println(listOfNumbers) // Inbuilt toString() method
    println(listOfNumbers::class.simpleName)
    println("--------------------------------------")

//    Mutable List

    var mutableListOfNumbers = mutableListOf("One",2)

    mutableListOfNumbers.add("Three")
    mutableListOfNumbers.add(4)
    mutableListOfNumbers.add("Five")

    println(mutableListOfNumbers)
    println(mutableListOfNumbers::class.simpleName)

    mutableListOfNumbers.removeAt(4)
    println(mutableListOfNumbers)

    mutableListOfNumbers.remove(2)
    println(mutableListOfNumbers)
    
    println("--------------------------------------")


}