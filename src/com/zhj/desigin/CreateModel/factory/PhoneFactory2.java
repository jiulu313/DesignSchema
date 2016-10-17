package com.zhj.desigin.CreateModel.factory;

/**
 *
 * Created by zhanghongjun on 16/10/17.
 * 多个方法
 *
 * 是对普通工厂方法模式的改进，
 * 在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
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
