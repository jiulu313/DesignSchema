package com.zhj.desigin.ActionModel.observe;

/**
 * 测试观察者模式
 */
public class ObserverTest {

    public static void test(){

        //创建两个观察者
        Observer car = new Car();
        Observer people = new People();

        //创建一个被观察者
        Observable observable = new Observable();

        //注册两个观察者
        observable.registerObserver(car);
        observable.registerObserver(people);

        //被观察者发出某一个事件
        observable.dataChanged();

    }


}
