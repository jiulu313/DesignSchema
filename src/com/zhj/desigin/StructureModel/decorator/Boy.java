package com.zhj.desigin.StructureModel.decorator;

/**
 * 具体装饰对象的实现类
 */
public class Boy extends Person{
    @Override
    public void dressed() {
        System.out.println("穿了内衣和内裤");
    }
}
