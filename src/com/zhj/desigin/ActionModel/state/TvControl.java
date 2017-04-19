package com.zhj.desigin.ActionModel.state;

/**
 * 遥控器
 */
public class TvControl implements PowerControl{
    TvState mState;

    public void setState(TvState state){
        mState = state;
    }

    //改变为开机状态
    @Override
    public void powerOn() {
        //改变为开机状态，把状态设置为开机状态
        setState(new PowerOnState());
        System.out.println("开机啦");
    }

    //改变为关机状态
    @Override
    public void powerOff() {
        //改变为关机状态，把状态设置为开机状态
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
