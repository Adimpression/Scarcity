// Generated from State.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateParser}.
 */
public interface StateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateParser#red}.
	 * @param ctx the parse tree
	 */
	void enterRed(@NotNull StateParser.RedContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#red}.
	 * @param ctx the parse tree
	 */
	void exitRed(@NotNull StateParser.RedContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#ded}.
	 * @param ctx the parse tree
	 */
	void enterDed(@NotNull StateParser.DedContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#ded}.
	 * @param ctx the parse tree
	 */
	void exitDed(@NotNull StateParser.DedContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#dred}.
	 * @param ctx the parse tree
	 */
	void enterDred(@NotNull StateParser.DredContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#dred}.
	 * @param ctx the parse tree
	 */
	void exitDred(@NotNull StateParser.DredContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#dependency}.
	 * @param ctx the parse tree
	 */
	void enterDependency(@NotNull StateParser.DependencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#dependency}.
	 * @param ctx the parse tree
	 */
	void exitDependency(@NotNull StateParser.DependencyContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull StateParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull StateParser.MainContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull StateParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull StateParser.StateContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull StateParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull StateParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#dbored}.
	 * @param ctx the parse tree
	 */
	void enterDbored(@NotNull StateParser.DboredContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#dbored}.
	 * @param ctx the parse tree
	 */
	void exitDbored(@NotNull StateParser.DboredContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#bored}.
	 * @param ctx the parse tree
	 */
	void enterBored(@NotNull StateParser.BoredContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#bored}.
	 * @param ctx the parse tree
	 */
	void exitBored(@NotNull StateParser.BoredContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#did}.
	 * @param ctx the parse tree
	 */
	void enterDid(@NotNull StateParser.DidContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#did}.
	 * @param ctx the parse tree
	 */
	void exitDid(@NotNull StateParser.DidContext ctx);

	/**
	 * Enter a parse tree produced by {@link StateParser#ed}.
	 * @param ctx the parse tree
	 */
	void enterEd(@NotNull StateParser.EdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateParser#ed}.
	 * @param ctx the parse tree
	 */
	void exitEd(@NotNull StateParser.EdContext ctx);
}