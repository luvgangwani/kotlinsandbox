fun main(args: Array<String>) {

    var setOfColors = mutableSetOf("Red", "Blue", "Green")

    println(setOfColors)

    setOfColors.add("Purple")
    setOfColors.remove("Blue") // cannot remove elements at a particular index as the collection is unordered

    println(setOfColors)

//    Set to List

    val listOfColors = setOfColors.toMutableList()
    listOfColors.removeAt(1)
    listOfColors.add("Purple")

    println(listOfColors)

//    List to Set

    setOfColors = listOfColors.toMutableSet()
    println(setOfColors)
}