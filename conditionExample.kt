fun main(args: Array<String>) {

    print("Enter a state abbreviation: ")
    val stateAbbr = readLine()

    if( stateAbbr == "CA") {
        println("The capital is Sacramento")
    } else if (stateAbbr == "OR") {
        println("The capital is Salem")
    } else {
        println("I don't know this state")
    }
}