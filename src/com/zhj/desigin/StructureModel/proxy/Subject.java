package com.zhj.desigin.StructureModel.proxy;

/**
 * Created by zhanghongjun on 16/10/19.
 *
 * 抽象角色
 *
 * 该类的主要职责是声明真实主题与代理的共同接口方法
 * 该类既可以是一个抽象类也可以是一个接口
 *
 */
public abstract class Subject {

    public abstract void visit();
}
