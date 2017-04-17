package com.zhj.desigin.ActionModel.observe;

/**
 * 观察者：车
 */
public class Car extends Observer{
    @Override
    protected void onChange() {
        System.out.println("绿灯亮了，我可以走了");
    }
}
