class MathLib {

    var result = 0.0

    fun addValues(num: Double): Double {
        result += num
        return result
    }
    companion object {

        fun getInput(prompt: String): Double {

            print(prompt)
            val user_input = readLine()
            val value = user_input!!.toDouble()

            return value
        }

        fun addValues(num1: Double, num2: Double): Double {
            return num1 + num2
        }

        fun subtractValues(num1: Double, num2: Double): Double {
            return num1 - num2
        }

        fun multiplyValues(num1: Double, num2: Double): Double {
            return num1 * num2
        }

        fun divideValues(num1: Double, num2: Double): Double {
            return num1 / num2
        }

    }
}