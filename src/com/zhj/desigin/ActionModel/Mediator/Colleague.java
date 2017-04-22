package com.zhj.desigin.ActionModel.Mediator;

/**
 *
 * 同事类（也就是多个交互对象的基类）
 */
public abstract class Colleague {
    protected Mediator mediator;  //每一个同事都知道其中介者


    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
