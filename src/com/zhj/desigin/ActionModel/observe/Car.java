package com.zhj.desigin.ActionModel.observe;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class Car extends Observer{
    @Override
    protected void onChange() {
        System.out.println("绿灯亮了，我可以走了");
    }
}
