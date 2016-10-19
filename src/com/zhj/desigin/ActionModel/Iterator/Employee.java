package com.zhj.desigin.ActionModel.Iterator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class Employee {
    private String name;
    private int age;


    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name="+name+"  age="+age;
    }
}
