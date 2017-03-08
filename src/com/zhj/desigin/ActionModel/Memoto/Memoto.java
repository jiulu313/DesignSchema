package com.zhj.desigin.ActionModel.Memoto;

/**
 * Created by zhanghongjun on 16/10/20.
 *
 * 备忘录，只是用来存储游戏过程中的数据
 */
public class Memoto {
    public int mCheckPoint; //游戏的关卡数
    public int mLifeValue;  //游戏的血量


    @Override
    public String toString() {
        return "mCheckPoint="+mCheckPoint+" mLifeValue="+mLifeValue;
    }
}
