package com.zhj.desigin.ActionModel.Chain;

/**
 * 主管
 */
public class Director extends Leader{
    @Override
    protected int limit() {
        return 5000;
    }

    @Override
    protected boolean handler(int money) {
        if(money > limit()){
            return false;
        }

        System.out.println("主管批准了报销");
        return true;
    }
}
