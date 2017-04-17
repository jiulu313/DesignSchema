package com.zhj.desigin.ActionModel.Chain;

/**
 *
 * 使多个对象都有计划处理请求，从而避免请求的发送者和接受者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 */
public abstract class Leader {
    protected Leader preLeader;   //上一级的领导

    public final void handleRequest(int money){
        if(handler(money)){
            return;
        }

        if(preLeader != null){
            preLeader.handleRequest(money);
        }
    }

    public void setPreLeader(Leader leader){
        this.preLeader = leader;
    }

    //自已能批复的最大的报销额度
    protected abstract int limit();

    //处理报销行为
    protected abstract boolean handler(int money);

}




