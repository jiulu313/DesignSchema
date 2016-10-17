package com.zhj.desigin;

import com.zhj.desigin.CreateModel.factory.FactoryMethod.Factory;
import com.zhj.desigin.CreateModel.factory.FactoryMethod.NokiaFactory;
import com.zhj.desigin.CreateModel.factory.Phone;
import com.zhj.desigin.CreateModel.factory.PhoneFactory;
import com.zhj.desigin.CreateModel.factory.PhoneFactory2;
import com.zhj.desigin.CreateModel.factory.PhoneFactory3;

/**
 * Created by zhanghongjun on 16/10/17.
 */
public class Main {
    public static void main(String[] args){

//       testNormalFactory();
//        testNormalFactory2();
//        testNormalFactory3();
        testFactoryMethod();

    }

    //测试普通工厂模式
    private static void testNormalFactory(){
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.produce("xiaomi");
        phone.call();
    }

    //测试普通工厂模式改进
    private static void testNormalFactory2(){
        PhoneFactory2 phoneFactory = new PhoneFactory2();
        Phone phone = phoneFactory.produceNokia();
        phone.call();
    }

    //测试普通工厂模式之静态工厂模式
    private static void testNormalFactory3(){
        Phone phone = PhoneFactory3.produceSanug();
        phone.call();
    }

    //测试工厂方法模式
    private static void testFactoryMethod(){
        Factory factory = new NokiaFactory();
        Phone phone = factory.produce();
        phone.call();
    }


}
