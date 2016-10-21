package com.zhj.desigin.ActionModel.Mediator;

/**
 * Created by zhanghongjun on 16/10/21.
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
