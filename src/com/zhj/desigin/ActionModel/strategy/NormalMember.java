package com.zhj.desigin.ActionModel.strategy;

/**
 * 普通会员不打折
 */
public class NormalMember implements ICalcPrice{
    @Override
    public double calcPrice(double price) {
        return price;
    }
}
