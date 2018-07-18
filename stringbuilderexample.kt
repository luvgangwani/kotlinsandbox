fun main(args: Array<String>) {

    var builder = StringBuilder("To be or not to be\n")
            .append("that is the question \n")
            .append("Whether 'tis nobler in the mind\n")
            .append("to suffer the slings and arrows")

    println("String Builder:\n${ builder }")

    val result = builder.toString()

    println("String value:\n${ result }")
}