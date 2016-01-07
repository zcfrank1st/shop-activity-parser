package com.dejionline.item.shop.activity.excutor;

import com.dejionline.item.shop.activity.gen.ShopActivityBaseVisitor;
import com.dejionline.item.shop.activity.gen.ShopActivityParser;

/**
 * Created by zcfrank1st on 1/7/16.
 */
public class Excutor extends ShopActivityBaseVisitor{
    @Override
    public Object visitName(ShopActivityParser.NameContext ctx) {
        return super.visitName(ctx);
    }

    @Override
    public Object visitProg(ShopActivityParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Object visitStm(ShopActivityParser.StmContext ctx) {
        return super.visitStm(ctx);
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
