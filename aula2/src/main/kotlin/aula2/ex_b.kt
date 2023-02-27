package aula2

import org.antlr.v4.runtime.CharStreams

val numbersStack = ArrayDeque<Int>()
val operationsStack = ArrayDeque<String>()
fun main() {

    val exp = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"
    val lexer = Expressions(CharStreams.fromString(exp))
    lexer.allTokens.forEach {
        println(it.text)
        when (it.type) {
            1 -> numbersStack.add(it.text.toInt())
            4 -> operationsStack.add(it.text)
            6 -> if (it.text == ")") calc()
        }
    }
    println(numbersStack)
    println(operationsStack)
}

fun calc() {
    when (operationsStack.removeLast()) {
        "+" -> sum(numbersStack.removeLast(), numbersStack.removeLast())
        "*" -> multiply(numbersStack.removeLast(), numbersStack.removeLast())
    }
}

fun multiply(first: Int, last: Int) {
    numbersStack.add(first * last)
}

fun sum(last: Int, first: Int) {
    numbersStack.add(first + last)
}
