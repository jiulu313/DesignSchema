package com.zhj.desigin.StructureModel.decorator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class Boy extends Person{
    @Override
    public void dressed() {
        System.out.println("穿了内衣和内裤");
    }
}
