package aula3

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
//    val testString1 = "\"Alan Kay\",1940,,true\r\n"
//    val testString2 = "\"Alan Kay\", 1938, ,true\r\n"
//    val testString3 = "\"Alan Turing \";1912;1954;false\r\n"
//    val testString4 = "Nome;Nascimento;Morte;Turing Award\r\n"
//    val testString5 = "\r\n"
//    val lexer = CSVGrammarLexer(CharStreams.fromString(testString3))
//    val parser = CSVGrammarParser(CommonTokenStream(lexer))
//
//    val line = parser.line()
//    for(id in line.field())
//        println(id.text)

    print(CharStreams.fromFileName("aula3.csv"))
    val lexerCsv = CSVGrammarLexer(CharStreams.fromFileName("aula3.csv"))
    print(lexerCsv.allTokens)
    val parserCsv = CSVGrammarParser(CommonTokenStream(lexerCsv))
    val csv = parserCsv.line()
    println(csv)
}
