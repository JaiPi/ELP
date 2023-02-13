import org.antlr.v4.runtime.CharStreams

//Exercício A: reconhecedor de tokens de expressão aritmética
//Partido do exemplo inicial dado, o objetivo é definir um reconhecedor de elementos de expressão aritmética, onde são permitidos:
//
//números inteiros
//números reais, com parte decimal separada por um ponto
//operadores ariteméticos simples: +, -, *, /
//operador ^ para a potência: base ^ exp
//parênteses ( ) para envolver operação binária
//
//Entre os elementos acima poderão estar espaços em branco. Atenção que neste exercício apenas trataremos de reconhecer os tokens de forma isolada, e não da sua correta formação (sintaxe).

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