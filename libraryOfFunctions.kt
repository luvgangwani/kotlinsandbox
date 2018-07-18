fun main(args: Array<String>) {

    try {
        
        val value1 = MathLib.getInput("Enter value 1: ")
        val value2 = MathLib.getInput("Enter value 2: ")

        println("Sum is ${ MathLib.addValues(value1, value2) }")

    } catch(e: NumberFormatException) {
        println("${ e.message } is not a number")
    } catch(e: Exception) {
        println("${ e.message }")
    }
}