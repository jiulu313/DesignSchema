package com.zhj.desigin.ActionModel.state;

/**
 * Created by zhanghongjun on 16/10/21.
 */
public class TvControl implements PowerControl{
    TvState mState;

    public void setState(TvState state){
        mState = state;
    }

    @Override
    public void powerOn() {
        setState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel(){
        mState.nextChannel();
    }

    public void preChannel(){
        mState.preChannel();
    }

    public void turnUp(){
        mState.turnUp();
    }

    public void turnDown(){
        mState.turnDown();
    }


}
