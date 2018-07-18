fun main(args: Array<String>) {

    val myInt = 42
    val myLong = myInt.toLong()

    println("The type(simpleName) of myLong is ${ myLong::class.simpleName }")
    println("The type(qualifiedName) of myLong is ${ myLong::class.qualifiedName }")

    val myLong2 = 42.9
    val myInt2 = myLong2.toInt()

    println("The value of myLong2 is ${ myLong2 }")
    println("The value of myInt2 is ${ myInt2 }")

}