import java.text.NumberFormat
import java.util.Locale

fun main(args: Array<String>) {

    val item = ClothingItem("Shirt", "L", 14.99)

    println(item) // inbuilt toString()

    item.price = 15.99

    println(item)

//    item.size = "M" // cannot change the values of a val type

    val itemTwo = ClothingItem("XL", 18.99)

    println(itemTwo)

    println("Price is : $${ itemTwo.price }") // Kotlin's version of currency formatting

//    Java's version of currency and localisation formatting

    var formatter = NumberFormat.getCurrencyInstance()
    println("Price in India is: ${ formatter.format(itemTwo.price) }")

    Locale.setDefault(Locale.FRANCE)
    formatter = NumberFormat.getCurrencyInstance() // re-assigning the formatter object for the localisation changes to take effect
    println("Price in France is: ${ formatter.format(itemTwo.price) }")

}