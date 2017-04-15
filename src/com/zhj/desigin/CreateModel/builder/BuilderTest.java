package com.zhj.desigin.CreateModel.builder;

/**
 * Created by zhanghongjun on 16/10/18.
 *
 */
public class BuilderTest {
    public static void main(String[] args){
        test();
    }


    public static void test(){
        Computer computer = new CustomerBuilder()
                .setMEM("8G")
                .setHDD("西部数据500G")
                .setCPU("i7")
                .build();
        System.out.println(computer);
    }
}
