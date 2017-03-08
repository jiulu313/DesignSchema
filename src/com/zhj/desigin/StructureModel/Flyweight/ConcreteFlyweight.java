package com.zhj.desigin.StructureModel.Flyweight;


/**
 * Created by zhanghongjun on 16/10/19.
 */
public class ConcreteFlyweight extends Flyweight{
    @Override
    protected void doSomething() {
        System.out.println("do something");
    }
}
