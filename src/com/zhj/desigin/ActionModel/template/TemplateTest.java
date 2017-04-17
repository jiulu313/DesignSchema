package com.zhj.desigin.ActionModel.template;

/**
 * 模板模式测试类
 */
public class TemplateTest {
    public static void main(String[] args){
        test();
    }

    public static void test(){
        EnterIceBox chickenEnterIceBox = new ChickenEnterIceBox();
        chickenEnterIceBox.start();

    }

}
