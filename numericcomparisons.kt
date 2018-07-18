fun main(args: Array<String>) {

    val num1 = 10
    val num2 = 15

    var match = (num1 == num2)

    println("Match is ${ match }")

    match = num1.equals(num2)

    println("Match is ${ match }")

    val match2 = num1.compareTo(num2)

    println("Match2 is ${ match2 }")

}