package com.zhj.desigin.DesignPrinciples.principles2;

import com.zhj.desigin.CreateModel.factory.NokiaPhone;
import com.zhj.desigin.CreateModel.factory.Phone;
import com.zhj.desigin.CreateModel.factory.SanuagPhone;
import com.zhj.desigin.CreateModel.factory.XiaoMiPhone;

/**
 *
 * Created by zhanghongjun on 16/10/17.
 * 简单工厂模式 之普通工厂模式
 * 有一个生产方法
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
