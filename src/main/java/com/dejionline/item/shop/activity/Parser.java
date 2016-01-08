package com.dejionline.item.shop.activity;

import com.dejionline.item.shop.activity.executor.Executor;
import com.dejionline.item.shop.activity.gen.ShopActivityLexer;
import com.dejionline.item.shop.activity.gen.ShopActivityParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by zcfrank1st on 1/7/16.
 */
public class Parser {
    public static void main(String[] args) {
        ShopActivityLexer lexer = new ShopActivityLexer(new ANTLRInputStream(""));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ShopActivityParser parser = new ShopActivityParser(tokens);

        ParseTree tree = parser.prog();

//        ParseTreeWalker walker = new ParseTreeWalker();
//
//        walker.walk(new ActivityProcessor(), tree);

        Executor vistor = new Executor();
        vistor.visit(tree);
    }
}
