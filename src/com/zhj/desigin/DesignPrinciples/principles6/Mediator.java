package com.zhj.desigin.DesignPrinciples.principles6;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanghongjun on 2017/4/14.
 */


//中介
public class Mediator {
    List<Room> roomList = new ArrayList<>();

    public Mediator(){
        for (int i = 0;i < 10 ;i++){
            roomList.add(new Room(12 + i, (12 + i) * 100 ));
        }
    }

    public Room rentOut(float area,float price){
        for(Room room : roomList){
            if(isSuitable(room,area,price)){
                return room;
            }
        }

        return null;
    }

    private boolean isSuitable(Room room,float area,float price){
        return room.area == area && room.price == price;
    }
}

