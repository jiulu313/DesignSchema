package com.zhj.desigin.ActionModel.observe;

import java.util.ArrayList;

/**
 * Created by zhanghongjun on 16/10/19.
 * 被观察者
 */
public class Observable {
    //观察者集合
    private ArrayList<Observer> observers = new ArrayList<>();

    //注册一个观察者
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    //反注册一个观察者
    public void unresgisterObserver(Observer observer){
        observers.remove(observer);
    }

    public void dataChanged(){
        for (Observer observer : observers){
            observer.onChange();
        }
    }

}
