package com.zhj.desigin.ActionModel.strategy;

/**
 * Created by zhanghongjun on 16/10/18.
 * 黄金会员打8折
 */
public class YellowGoldMember implements ICalcPrice{
    @Override
    public double calcPrice(double price) {
        return 0.8 * price;
    }
}
