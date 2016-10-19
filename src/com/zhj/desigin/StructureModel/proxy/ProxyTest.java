package com.zhj.desigin.StructureModel.proxy;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class ProxyTest {

    public static void test(){
        Subject realSubject = new RealSubject();
        Subject proxy = new ProxySubject(realSubject);

        //代理者代替真实者做事情
        proxy.request();

    }

}
