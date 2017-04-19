package com.zhj.desigin.ActionModel.state;

/**
 * 电视状态接口，定义了电视操作的函数
 */
public interface TvState {
    void nextChannel();     //下一个频道
    void preChannel();      //上一个频道
    void turnUp();          //调高音量
    void turnDown();        //调低音量
}
