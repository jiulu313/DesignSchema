package com.zhj.desigin.CreateModel.factory.NormalFactory;

import com.zhj.desigin.CreateModel.factory.NokiaPhone;
import com.zhj.desigin.CreateModel.factory.Phone;
import com.zhj.desigin.CreateModel.factory.SanuagPhone;
import com.zhj.desigin.CreateModel.factory.XiaoMiPhone;

/**
 *
 * 工厂类中有许多的方法用来生产不同的产品的
 *
 * 是对简单工厂方法模式的改进，
 * 在简单工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
 *
 */
public class PhoneFactory2 {
    public Phone produceNokia(){
        return new NokiaPhone();
    }

    public Phone produceXiaomi(){
        return new XiaoMiPhone();
    }

    public Phone produceSanug(){
        return new SanuagPhone();
    }

}
