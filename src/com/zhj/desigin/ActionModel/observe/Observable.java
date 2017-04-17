package com.zhj.desigin.ActionModel.observe;

import java.util.ArrayList;

/**
 * 被观察者：灯
 */
public class Observable {
    //观察者集合
    private ArrayList<Observer> observers = new ArrayList<>();

    //注册一个观察者
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    //反注册一个观察者
    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    public void dataChanged(){
        for (Observer observer : observers){
            observer.onChange();
        }
    }

}
