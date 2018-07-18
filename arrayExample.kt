fun main(args: Array<String>) {

//    Array of similar type

    var colors = arrayOf("Red", "Green", "Blue")
    for(item in colors){
        println(item)
    }
    println("-------------------------------")
//    Array of mixed type

    val mixedArr = arrayOf("One", 2, 3, "Four", 5)
    for(item in mixedArr){
        println(item)
    }
    println("-------------------------------")

//    Array of nulls

    var nullArr = arrayOfNulls<Any>(3)

    nullArr[0] = "One"
    nullArr[1] = 2
    nullArr.set(2, "Three")


    for(item in nullArr){
        println(item)
    }

    println("-------------------------------")

//    Array of Integers

    val intArr = intArrayOf(1, 3, 5, 7, 9)
    for(item in intArr){
        println(item)
    }

    println("-------------------------------")

//    Sort array

    colors.sort()
    for(item in colors){
        println(item)
    }
    println("===============================")

    colors = colors.sortedArrayDescending()
    for(item in colors){
        println(item)
    }

    println("-------------------------------")
}

