data class ClothingItem constructor (var type: String?, // used to specify a parametrised constructor
                                     val size: String,
                                     var price: Double) {
    init { // used to specify a default constructor
        type = type?.toUpperCase()
    }

    constructor(size: String, price: Double): this(null, size, price){ // overloading the constructor
        type = "UNKNOWN"
    }
}