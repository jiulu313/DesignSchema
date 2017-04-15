package com.zhj.desigin.DesignPrinciples.principles6;

import com.zhj.desigin.DesignPrinciples.principles6.*;


/**
 * Created by zhanghongjun on 2017/4/14.
 * 迪米特原则
 */

//客户
public class Customer {
    public float roomArea;
    public float roomPrice;

    public void rentRoom(Mediator mediator){
        System.out.println(mediator.rentOut(roomArea,roomPrice));
    }


    public static void main(String[] args){
        //客户
        Customer customer = new Customer();
        //中介
        Mediator mediator = new Mediator();
        //租房子
        customer.rentRoom(mediator);

    }
}
