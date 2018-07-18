fun main(args: Array<String>) {

    try {

        print("Enter value 1: ")

        val value1 = readLine()
        val d1 = value1!!.toDouble()

        println("Value 1 is ${ d1 }")

        print("Enter value 2: ")

        val value2 = readLine()
        val dl2 = value2!!.toDouble()

        val sum = d1 + dl2
        println("Sum is ${ sum }")

    } catch (e: KotlinNullPointerException) {
        println("Value is null")
    } catch (e: NumberFormatException) {
        println("${ e.message } is not a number")
    }
}