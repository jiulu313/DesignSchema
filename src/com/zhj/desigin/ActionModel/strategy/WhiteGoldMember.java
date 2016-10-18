package com.zhj.desigin.ActionModel.strategy;

/**
 * Created by zhanghongjun on 16/10/18.
 * 白金会员打9折
 */
public class WhiteGoldMember implements ICalcPrice{
    @Override
    public double getPrice(double price) {
        return 0.9 * price;
    }
}
