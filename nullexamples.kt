fun main(args: Array<String>) {
    val nullString: String? = null

    println(nullString)

    var len:Int? = nullString?.length

    println("Length of nullString is ${ len }")

    if(len == null) {
        println("Length of nullString is null")
    } else {
        println("Length of nullString is ${ len }")
    }

    var message = if(len != null) {
        "Length of nullString is ${ len }"
    } else {
        "Length of nullString is null"
    }

    println(message)

    var len1 = len ?: -1

    println("Len1 ${ len1 }")

    try {

        var len2 = len!!

        println("Len2 ${ len2 }")

    } catch(e: KotlinNullPointerException) {
        println("Len2 is null")
    }


}