package com.zhj.desigin.StructureModel.adapter.classAdapter;

/**
 * 下面是类适配器模式的测试类
 */
public class ClassAdapterTest {
    public static void main(String[] args){
        test();
    }

    public static void test(){

        ClassVoltAdapter voltAdapter = new ClassVoltAdapter();
        System.out.println(voltAdapter.getVolt5());

    }

}
