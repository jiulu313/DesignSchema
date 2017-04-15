package com.zhj.desigin.DesignPrinciples.principles6;

/**
 * Created by zhanghongjun on 2017/4/14.
 */

//房间
public class Room {
    public float area;  //面积
    public float price; //价格

    public Room(float area, float price) {
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room area=" + area + ",price=" + price;
    }

}



