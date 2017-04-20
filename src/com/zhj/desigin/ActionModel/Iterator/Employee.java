package com.zhj.desigin.ActionModel.Iterator;

/**
 * 员工实体类
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
