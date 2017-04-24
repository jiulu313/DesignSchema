package com.zhj.desigin.StructureModel.Flyweight;


/**
 * 具体的享元对象
 */
public class ConcreteFlyweight extends Flyweight{
    @Override
    protected void doSomething() {
        System.out.println("do something");
    }
}
