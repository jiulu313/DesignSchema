package com.zhj.desigin.ActionModel.Chain;

/**
 * 老板
 * 不限制
 */
public class Boss extends Leader{

    @Override
    protected int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected boolean handler(int money) {
        if(money > limit()){
            return false;
        }

        System.out.println("老板批准了报销");
        return true;
    }
}
