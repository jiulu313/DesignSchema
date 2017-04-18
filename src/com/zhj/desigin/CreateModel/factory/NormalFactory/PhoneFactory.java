package com.zhj.desigin.CreateModel.factory.NormalFactory;


import com.zhj.desigin.CreateModel.factory.NokiaPhone;
import com.zhj.desigin.CreateModel.factory.Phone;
import com.zhj.desigin.CreateModel.factory.SanuagPhone;
import com.zhj.desigin.CreateModel.factory.XiaoMiPhone;

/**
 *
 * 简单工厂模式
 * 工厂里面有一个生产手机的方法，根据不同的值生产不同的手机
 *
 */
public class PhoneFactory {

    public Phone produce(String type){
        Phone phone = null;

        if("xiaomi".equals(type)){
            phone = new XiaoMiPhone();
        }else if("sanuag".equals(type)){
            phone = new SanuagPhone();
        }else if("nokia".equals(type)){
            phone = new NokiaPhone();
        }

        return phone;
    }

}
