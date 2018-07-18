fun main(args: Array<String>) {

    val personOne = Person("Joe", "West", 45)

    println("Details of Person one:")
    displayDetails(personOne)

}

fun displayDetails(personObj: Person) {

    println("Full Name: ${ personObj.fullName }")
    println("Age: ${ personObj.age }")
    personObj.age = personObj.age
    println("Age in 5 years: ${ personObj.age }")
}