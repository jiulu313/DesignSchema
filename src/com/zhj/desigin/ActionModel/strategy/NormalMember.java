package com.zhj.desigin.ActionModel.strategy;

/**
 * Created by zhanghongjun on 16/10/18.
 * 普通会员不打折
 */
public class NormalMember implements ICalcPrice{
    @Override
    public double getPrice(double price) {
        return price;
    }
}
