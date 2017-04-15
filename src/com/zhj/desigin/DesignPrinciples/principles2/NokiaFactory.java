package com.zhj.desigin.DesignPrinciples.principles2;

import com.zhj.desigin.CreateModel.factory.NokiaPhone;
import com.zhj.desigin.CreateModel.factory.Phone;

/**
 * Created by zhanghongjun on 16/10/17.
 */
public class NokiaFactory implements Factory {
    @Override
    public Phone produce() {
        return new NokiaPhone();
    }
}
