package com.zhj.desigin.ActionModel.Mediator;

/**
 * 声卡类
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    //播放音频
    public void soundPlay(String data) {
        System.out.println("音频：" + data);
    }
}
