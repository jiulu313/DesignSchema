package com.zhj.desigin.StructureModel.Flyweight;

import java.util.HashMap;

/**
 * Created by zhanghongjun on 16/10/19.
 *
 *  享元模式的核心在于享元工厂类，
 *  享元工厂类的作用在于提供一个用于存储享元对象的享元池，
 *  用户需要对象时，首先从享元池中获取，
 *  如果享元池中不存在，则创建一个新的享元对象返回给用户，并在享元池中保存该新增对象。
 *
 */
public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);

        if(flyweight == null){
            flyweight = new ConcreteFlyweight();
            flyweights.put(key,flyweight);
        }

        return flyweight;
    }


}
