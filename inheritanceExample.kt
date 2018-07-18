fun main(args: Array<String>) {

    val sup = SuperClass(42)
    println(sup)
    println(sup.multiply(100))

    val sub = SubClass(53)
    println(sub)
    print(sub.multiply(100))

}

open class SuperClass constructor(aInt: Int) {

    protected val _aInt = aInt

    override fun toString(): String{
        return "${ this::class.simpleName} -> aInt = ${ _aInt }"
    }

    open fun multiply(factor: Int): Int {
        return (this._aInt * factor)
    }

}

class SubClass constructor(val aInt: Int): SuperClass(aInt) {

    override fun multiply(factor: Int): Int{
        return (aInt * factor * 2)
    }
}