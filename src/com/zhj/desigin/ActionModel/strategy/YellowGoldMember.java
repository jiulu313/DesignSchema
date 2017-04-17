package com.zhj.desigin.ActionModel.strategy;

/**
 * 黄金会员打8折
 */
public class YellowGoldMember implements ICalcPrice{
    @Override
    public double calcPrice(double price) {
        return 0.8 * price;
    }
}
