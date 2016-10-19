package com.zhj.desigin.ActionModel.template;

/**
 * Created by zhanghongjun on 16/10/18.
 * 把大象放冰箱
 */
public abstract class EnterIceBox {

    protected void openDoor(){
        System.out.println(" 1 打开冰箱门");
    }

    protected void enterInfoIcobox(){
        System.out.println(" 2 把大象放冰箱");
    }

    protected void closeDoor(){
        System.out.println(" 3 关闭冰箱门");
    }

    protected final void start(){
        openDoor();
        enterInfoIcobox();
        closeDoor();
    }

}



