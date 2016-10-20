package com.zhj.desigin.ActionModel.Chain;

/**
 * Created by zhanghongjun on 16/10/20.
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
