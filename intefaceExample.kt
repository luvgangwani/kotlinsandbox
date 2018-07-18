fun main(args: Array<String>) {
    val buster = Retriever()
    makeItTalk(buster)
    reportBreed("Buster", buster)
}

fun makeItTalk(ret: Retriever){
    ret.speak()
}

fun reportBreed(name: String, ret: Retriever) {
    println("${ name } is a ${ ret::class.simpleName}, and its fur is ${ ret.fur }")
}

interface Dog {
    val fur: String
    fun speak() {
        println("Woof!")
    }
}

interface Cat {
    val fur: String
    fun speak() {
        println("Meow!")
    }
}

class Retriever: Dog, Cat {

    override val fur = "golden"

    override fun speak(){
        super<Dog>.speak()
        super<Cat>.speak()
    }
}