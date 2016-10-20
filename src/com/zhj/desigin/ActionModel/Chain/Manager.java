package com.zhj.desigin.ActionModel.Chain;

/**
 * Created by zhanghongjun on 16/10/20.
 */
public class Manager extends Leader{
    @Override
    protected int limit() {
        return 10000;
    }

    @Override
    protected boolean handler(int money) {
        if(money > limit()){
            return false;
        }

        System.out.println("经理批准了报销");
        return true;
    }
}
