package aula2

import org.antlr.v4.runtime.CharStreams

fun main() {
    
    val numInt = "123 4 5 6"
    val numDec = "1.2 4.3  6.1"
    val opArithmetic = "+ - * /"
    val opPower = "^"
    val parentheses = "( )"

    val lexerNumInt = Expressions(CharStreams.fromString(numInt))
    lexerNumInt.allTokens.forEach { println(it.text) }

    val lexerNumDecimal = Expressions(CharStreams.fromString(numDec))
    lexerNumDecimal.allTokens.forEach { println(it.text) }

    val lexerOpArithmetic = Expressions(CharStreams.fromString(opArithmetic))
    lexerOpArithmetic.allTokens.forEach { println(it.text) }

    val lexerOpPower = Expressions(CharStreams.fromString(opPower))
    lexerOpPower.allTokens.forEach { println(it.text) }

    val lexerParentheses = Expressions(CharStreams.fromString(parentheses))
    lexerParentheses.allTokens.forEach { println(it.text) }

}