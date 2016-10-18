package com.zhj.desigin.CreateModel.singleton;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton(){}

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
