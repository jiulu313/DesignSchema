package com.zhj.desigin.ActionModel.observe;

/**
 * 观察者：行人
 */
public class People extends Observer{
    @Override
    protected void onChange() {
        System.out.println("红灯亮了，我要等一等");
    }
}
