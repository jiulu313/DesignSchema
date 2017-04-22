package com.zhj.desigin.ActionModel.Mediator;

/**
 * 显卡类
 */
public class GraphicsCard extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    //播放视频
    public void videoPlay(String data) {
        System.out.println("视频：" + data);
    }

}
