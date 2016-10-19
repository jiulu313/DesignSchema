package com.zhj.desigin.StructureModel.proxy;

/**
 * Created by zhanghongjun on 16/10/19.
 * 真实角色
 *
 * 该类也称为被委托类或被代理类，该类定义了代理所表示的真实对象
 * 由其执行具体的业务逻辑方法，而客户类则通过代理类间接地调用真实主题类中定义的方法
 *
 */
public class RealSubject extends Subject{
    @Override
    public void visit() {

    }
}
