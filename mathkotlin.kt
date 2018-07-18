import kotlin.math.abs
import kotlin.math.round

fun main(args: Array<String>) {

    var neg = -152.40

    val absoluteOfNeg = abs(neg)
    val roundOfAbs = round(absoluteOfNeg)

    println("Absolute value is ${ absoluteOfNeg }")
    println("Round of value is ${ roundOfAbs }")
}