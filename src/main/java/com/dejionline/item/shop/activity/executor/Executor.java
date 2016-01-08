package com.dejionline.item.shop.activity.executor;

import com.dejionline.item.shop.activity.gen.ShopActivityBaseVisitor;
import com.dejionline.item.shop.activity.gen.ShopActivityParser;

/**
 * Created by zcfrank1st on 1/8/16.
 */
public class Executor extends ShopActivityBaseVisitor {
    @Override
    public Object visitProg(ShopActivityParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Object visitStm(ShopActivityParser.StmContext ctx) {
        return super.visitStm(ctx);
    }

    @Override
    public Object visitName(ShopActivityParser.NameContext ctx) {
        return super.visitName(ctx);
    }

    @Override
    public Object visitSubject(ShopActivityParser.SubjectContext ctx) {
        return super.visitSubject(ctx);
    }

    @Override
    public Object visitEffect(ShopActivityParser.EffectContext ctx) {
        return super.visitEffect(ctx);
    }
}
