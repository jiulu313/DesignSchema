package com.zhj.desigin.ActionModel.Visitor;

/**
 * 经理类型
 */
public class Manager extends Staff{
    public Manager(String name){
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //经理一年内做的产品的数量
    public int getProducts(){
        return 10;
    }
}
