package com.zhj.desigin.ActionModel.state;

/**
 * Created by zhanghongjun on 16/10/21.
 */
public class StateTest {

    public static void test(){
        //电视
        TvControl tvControl = new TvControl();
        //设置开机状态
        tvControl.powerOn();
        //下一个频道
        tvControl.nextChannel();
        //调大音量
        tvControl.turnUp();
        //设置关机状态
        tvControl.powerOff();
        //调高音量，此时不会生效
        tvControl.turnUp();


    }

}
