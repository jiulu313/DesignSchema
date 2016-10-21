package com.zhj.desigin.ActionModel.Mediator;

/**
 * Created by zhanghongjun on 16/10/21.
 */
public class CDDevice extends Colleague{
    private String data;    //视频数据

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    //读取视频数据
    public String read(){
        return data;
    }

    //加载视频数据
    public void load(){
        data = "视频数据,音频数据";

        //通知中介者，也就是主板数据改变
        mediator.changed(this);
    }


}
