package com.zhj.desigin.ActionModel.strategy;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class Shop {
    ICalcPrice strategy;

    public void setStrategy(ICalcPrice strategy){
        this.strategy = strategy;
    }

    public double calcPrice(double price){
        return strategy.calcPrice(price);
    }

}
