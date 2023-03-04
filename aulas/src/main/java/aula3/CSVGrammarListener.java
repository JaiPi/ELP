// Generated from java-escape by ANTLR 4.11.1
package aula3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVGrammarParser}.
 */
public interface CSVGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CSVGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CSVGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CSVGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CSVGrammarParser.FieldContext ctx);
}