import Operations.*

fun main(args: Array<String>) {
    try {

        val numOne = MathLib.getInput("Enter 1st Number: ")

        val numTwo = MathLib.getInput("Enter 2nd Number: ")

        print("Enter operator (+, -, *, /): ")
        val op = readLine()

        val result: Double? = when(op) {

            ADD.operator -> MathLib.addValues(numOne, numTwo)
            SUBTRACT.operator -> MathLib.subtractValues(numOne, numTwo)
            MULTIPLY.operator -> MathLib.multiplyValues(numOne, numTwo)
            DIVIDE.operator -> MathLib.divideValues(numOne, numTwo)
            else -> throw Exception("Unknown Error")
        }

        println("Result is ${ result }")

    } catch(e: NumberFormatException) {
        println("${ e.message } is not a number")
    } catch (e: Exception) {
        println("${e.message}")
    }

}