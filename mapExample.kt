fun main(args: Array<String>) {

//    Immutable Map
    val mapOfNumbers = mapOf(

            Pair(1, "One"),
            Pair(2, "Two"),
            Pair(3, "Three")
    )

    println(mapOfNumbers)
    println(mapOfNumbers::class.simpleName)


// Mutable Map

    val mutableMapOfNumbers = mutableMapOf<Int, String>()

    mutableMapOfNumbers.put(1, "One")
    mutableMapOfNumbers.put(2, "Two")
    mutableMapOfNumbers.put(3, "Three")
    mutableMapOfNumbers.put(4, "Four")
    mutableMapOfNumbers.put(5, "Five")

    println(mutableMapOfNumbers)

    for(eachNum in mutableMapOfNumbers.keys) {
        println("Number ${ eachNum } in words is ${ mutableMapOfNumbers[eachNum] }")
    }

//    Map of Clothing Items

    val cart = mutableMapOf<ClothingItem, Int>()

    cart.put(ClothingItem("Shirt", "L", 14.99), 2)
    cart.put(ClothingItem("Pants", "L", 20.99), 2)
    cart.put(ClothingItem("Shoes", "10", 24.00), 1)

    println(cart)

    printOrder(cart)
}

fun printOrder(cart: MutableMap<ClothingItem, Int>) {

    var total = 0.00

    for((item, quantity) in cart){
        total += (quantity*item.price)
        println("Item ${ item.type?.toLowerCase()?.capitalize() } @ ${ item.price } = ${ quantity*item.price}")
    }

    println("------------------------")
    println("Total: ${ total }")
}