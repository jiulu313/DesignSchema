package com.zhj.desigin.CreateModel.singleton;

/**
 * Created by zhanghongjun on 16/10/18.
 */

//单例模式
public class Singleton {
    private static volatile Singleton instance;

    //防止类外直接new
    private Singleton(){}

    //双重检查
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }


    //业务方法
    public void show(){
        System.out.println("我是业务方法");
    }

}
