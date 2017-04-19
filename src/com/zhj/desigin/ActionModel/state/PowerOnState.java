package com.zhj.desigin.ActionModel.state;

/**
 * 开机状态
 */
public class PowerOnState implements TvState{
    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void preChannel() {
        System.out.println("上一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
