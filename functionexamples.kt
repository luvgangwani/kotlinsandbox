fun main(args: Array<String>) {

    val num1 = 4.0
    val num2 = 2.0

    var result = addValues(num1, num2)

    println("Normal function invocation results ${ result }")

    result = addValues(num2 = num1, num1 = num2)

    println("Function invocation using named parameters results ${ result }")

    println("Addition is: ${ calcValues(num1, num2, "+") }")
    println("Subtraction is: ${ calcValues(num1, num2, "-") }")
    println("Multiplication is: ${ calcValues(num1, num2, "*") }")
    println("Division is: ${ calcValues(num1, num2, "/") }")
    println("Result is: ${ calcValues(num1, num2, ")") }")
}

fun addValues(num1: Double, num2: Double) : Double {

    return num1 + num2
}

fun calcValues(num1: Double, num2: Double, op: String): Any {

    var result = 0.toDouble()
    var msg = String()

    if (op.equals("+")) {

        result = num1 + num2

    } else if(op.equals("-")) {

        result = num1 - num2

    } else if (op.equals("*")) {

        result = num1 * num2

    } else if (op.equals("/")) {

        result = num1 / num2

    } else {

        msg = "Please select a valid operation"

    }

    if (result > 0) {

        return result
    }
    else {

        return msg
    }

}