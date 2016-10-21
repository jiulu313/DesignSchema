package com.zhj.desigin.ActionModel.Mediator;

import com.zhj.desigin.ActionModel.command.MediaPlayer;

/**
 * Created by zhanghongjun on 16/10/21.
 *
 * 同事
 */
public abstract class Colleague {
    protected Mediator mediator;  //每一个同事都知道其中介者


    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
