package com.zhj.desigin.ActionModel.Mediator;


/**
 * Created by zhanghongjun on 16/10/21.
 */
public class CPU extends Colleague{
    private String dataVideo;
    private String dataSound;


    public CPU(Mediator mediator) {
        super(mediator);
    }


    //获取视频数据
    public String getDataVideo(){
        return dataVideo;
    }

    public String getDataSound(){
        return dataSound;
    }

    //解码数据
    public void decodeData(String data){
        String[] tmp = data.split(",");

        dataVideo = tmp[0];
        dataSound = tmp[1];

        mediator.changed(this);
    }


}
