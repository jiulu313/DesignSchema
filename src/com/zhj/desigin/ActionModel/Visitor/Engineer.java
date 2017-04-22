package com.zhj.desigin.ActionModel.Visitor;


import java.util.Random;

/**
 * 工程师类型
 */
public class Engineer extends Staff {
    public Engineer(String name){
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //工程师这一年写的代码数量
    public int getCodeLine(){
        return new Random().nextInt() * 10000;
    }
}


