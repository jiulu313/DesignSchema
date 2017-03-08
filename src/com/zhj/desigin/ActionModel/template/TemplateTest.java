package com.zhj.desigin.ActionModel.template;

/**
 * Created by zhanghongjun on 16/10/18.
 * 模板模式
 */
public class TemplateTest {
    public static void main(String[] args){
        test();
    }

    public static void test(){
        ChickenEnterIceBox chickenEnterIceBox = new ChickenEnterIceBox();

        chickenEnterIceBox.start();

    }

}
