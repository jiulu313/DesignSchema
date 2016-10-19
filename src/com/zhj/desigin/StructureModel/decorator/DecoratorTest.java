package com.zhj.desigin.StructureModel.decorator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class DecoratorTest {

    public static void test(){

        //首先我们要有一个Person对象
        Person person = new Boy();

        //然后为他穿上便宜的衣服
        PersonCloth personCloth = new CheapCloth(person);
        person.dressed();

        PersonCloth personCloth1 = new ExpensiveCloth(personCloth);
        personCloth1.dressed();


    }

}
