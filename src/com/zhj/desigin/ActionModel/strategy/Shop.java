package com.zhj.desigin.ActionModel.strategy;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class Shop {
    ICalcPrice strategy;

    public void setStrategy(ICalcPrice strategy){
        this.strategy = strategy;
    }

    public double getPrice(double price){
        return strategy.getPrice(price);
    }

}
