// Generated from java-escape by ANTLR 4.11.1
package aula3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CSVGrammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CSVGrammarParser.FieldContext ctx);
}