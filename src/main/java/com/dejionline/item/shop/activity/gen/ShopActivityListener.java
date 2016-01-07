// Generated from /Users/zcfrank1st/Desktop/git-svn/shop-activity-parser/src/main/java/com/dejionline/item/shop/activity/grammar/ShopActivity.g4 by ANTLR 4.5.1
package com.dejionline.item.shop.activity.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShopActivityParser}.
 */
public interface ShopActivityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShopActivityParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ShopActivityParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShopActivityParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ShopActivityParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShopActivityParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStm(ShopActivityParser.StmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShopActivityParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStm(ShopActivityParser.StmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShopActivityParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ShopActivityParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShopActivityParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ShopActivityParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShopActivityParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(ShopActivityParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShopActivityParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(ShopActivityParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShopActivityParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(ShopActivityParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShopActivityParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(ShopActivityParser.EffectContext ctx);
}