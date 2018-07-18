fun main(args: Array<String>) {
    val num1 = 15
    val num2 = 10
    var num3 = 11

    var result = num1 + num2

    println("Sum is ${ result }")

    result = num1.plus(num2)

    println("Sum using plus function is ${ result }")

    result = num1 - num2

    println("Difference is ${ result }")

    result = num1 * num2

    println("Product is ${ result }")

    result = num1 / num2

    println("Quotient is ${ result }")

    num3++

    println("Increment of num3 is ${ num3 }")

    println("Inline post-increment of num3 is ${ num3++ }")

    println("Inline pre-increment of num3 is ${ ++num3 }")

    val incrementNum3 = num3.inc() // inc() function needs to be assigned to a variable. It does not return the incremented value

    println("Increment of num3 using the inc() function is ${ incrementNum3 }")



}