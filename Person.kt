data class Person constructor(private var firstName: String,
                              private var lastName: String,
                              private var personAge: Int) {

    var fName: String = firstName
        get() {
            return field
        }

    var lName: String = lastName
        get() {
            return field
        }

    var fullName: String = "${ fName } ${ lName }"
        get() {
            return field
        }

    var age: Int = personAge
        get() {
            return field
        }
        set(value) {
            field += 5
        }
}