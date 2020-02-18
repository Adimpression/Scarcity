// Generated from State.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateParser#red}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRed(@NotNull StateParser.RedContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#ded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDed(@NotNull StateParser.DedContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#dred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDred(@NotNull StateParser.DredContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#dependency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependency(@NotNull StateParser.DependencyContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(@NotNull StateParser.MainContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull StateParser.StateContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull StateParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#dbored}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbored(@NotNull StateParser.DboredContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#bored}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBored(@NotNull StateParser.BoredContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#did}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDid(@NotNull StateParser.DidContext ctx);

	/**
	 * Visit a parse tree produced by {@link StateParser#ed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEd(@NotNull StateParser.EdContext ctx);
}