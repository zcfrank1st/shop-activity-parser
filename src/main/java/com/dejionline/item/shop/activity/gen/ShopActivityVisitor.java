// Generated from /Users/zcfrank1st/Desktop/git-svn/shop-activity-parser/src/main/java/com/dejionline/item/shop/activity/grammar/ShopActivity.g4 by ANTLR 4.5.1
package com.dejionline.item.shop.activity.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShopActivityParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShopActivityVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShopActivityParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ShopActivityParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShopActivityParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm(ShopActivityParser.StmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShopActivityParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ShopActivityParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShopActivityParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(ShopActivityParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShopActivityParser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect(ShopActivityParser.EffectContext ctx);
}