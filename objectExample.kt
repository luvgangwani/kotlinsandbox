fun main(args: Array<String>) {
    try {
        val mathLibObj = MathLib()
        var result = 0.0

        while(result < 50.0){
            val num = MathLib.getInput("Enter a number: ")
            result = mathLibObj.addValues(num)
            println("Result is ${ result }")
        }

    } catch(e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch(e: Exception) {
        println("${e.message}")
    }
}