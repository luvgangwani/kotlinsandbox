fun main(args: Array<String>) {
    var str = "Hello!"

    println("String value is ${ str }")

//    Convert string to char list

    val toCharArr = str.toCharArray()

    println("Char Array ${ toCharArr }")

    val toCharList = toCharArr.toList()

    println("Char List ${ toCharList }")

//    Convert string to byte list

    val toByteArr = str.toByteArray()

    println("Byte Array ${ toByteArr }")

    val toByteList = toByteArr.toList()

    println("Byte List ${ toByteList }")

    var emptyStr = String()

    println("Empty string '${ emptyStr }'")

//    Concatenate to a string

    str += " and Welcome!"

    println("Concatenated string ${ str }")

//    Iterate through a string

    val len = str.length
    for(i in 0 until len) {
        val c = str.get(i)
        println(c)
    }

//    Substring

    val p = str.indexOf("W")
    val subStr = str.substring(p)
    println("Substring ${ subStr }")

//    Casing

    val str2 = "Welcome!"
    var match = subStr.equals(str2.toUpperCase(), true)
    println("Does it match? ${ match }")

}