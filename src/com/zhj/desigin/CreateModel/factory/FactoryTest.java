package com.zhj.desigin.CreateModel.factory;

/**
 * Created by zhanghongjun on 16/10/17.
 */
public class FactoryTest {
    public static void main(String[] args){

        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.produce("xiaomi");
        phone.call();
    }
}
