fun main(args: Array<String>) {

//     Immutable variable

    val num1 = 15

    println("Value of num1 is ${ num1 }")

//    num1++ // gives an error as num1 is immutable

//     Mutable variable

    var num2 = 30

    println("Initial value of num2 is ${ num2 }")

    num2++

    println("New value of num2 is ${ num2 }")

//    Specify data-types

    var num3: Double = 5.toDouble() // cannot use the value without toDouble() as an integer value will not be accepted for a Double

    println("Value of num3 is ${ num3 }")

//    Nullable variable

    var num4: Int? = null // ? allows the value of a variable to be null

    println("Value of num4 is ${ num4 }")

}