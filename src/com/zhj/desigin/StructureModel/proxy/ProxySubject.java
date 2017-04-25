package com.zhj.desigin.StructureModel.proxy;

/**
 *
 * 代理类
 * 委托对象与代理对象需要实现相同的接口
 * 该类也被称为委托类或者代理类，该类持有一个对真实主题的类的引用
 * 在其所实现的接口方法中调用真实主题类中相应的接口方法执行，以此起到代理的作用
 *
 *
 */
public class ProxySubject extends Subject{
    Subject realSubject = null;

    public ProxySubject(Subject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        preRequest();           //真实角色前
        realSubject.visit();
        postRequest();          //真实角色后
    }


    private void preRequest(){
    }

    private void postRequest(){
    }

}
