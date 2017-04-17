package com.zhj.desigin.ActionModel.Chain;

/**
 * 组长
 * 只多只能报1000元以内的
 */
public class GroupLeader extends Leader{
    @Override
    protected int limit() {
        return 1000;
    }

    @Override
    protected boolean handler(int money) {
        if(money > limit()){
            return false;
        }

        System.out.println("组长批准了报销");
        return true;
    }
}
