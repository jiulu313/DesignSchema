package com.zhj.desigin.StructureModel.proxy;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class ProxyTest {

    public static void test(){
        //构造一个真实对象
        Subject realSubject = new RealSubject();

        //通过一个真实对象构造一个代理对象
        Subject proxy = new ProxySubject(realSubject);

        //调用代理对象的相关方法
        proxy.visit();

    }

}
