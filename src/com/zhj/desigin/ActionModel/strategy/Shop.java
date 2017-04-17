package com.zhj.desigin.ActionModel.strategy;

/**
 * 商场
 */
public class Shop {
    ICalcPrice strategy;

    //设置不同的策略
    public void setStrategy(ICalcPrice strategy){
        this.strategy = strategy;
    }

    //计算价格
    public double calcPrice(double price){
        return strategy.calcPrice(price);
    }

}
