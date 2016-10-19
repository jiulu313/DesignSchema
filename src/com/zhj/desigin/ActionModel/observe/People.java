package com.zhj.desigin.ActionModel.observe;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class People extends Observer{
    @Override
    protected void onChange() {
        System.out.println("红灯亮了，我要等一等");
    }
}
