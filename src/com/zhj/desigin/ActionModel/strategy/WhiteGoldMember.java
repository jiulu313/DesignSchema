package com.zhj.desigin.ActionModel.strategy;

/**
 * 白金会员打9折
 */
public class WhiteGoldMember implements ICalcPrice{
    @Override
    public double calcPrice(double price) {
        return 0.9 * price;
    }
}
