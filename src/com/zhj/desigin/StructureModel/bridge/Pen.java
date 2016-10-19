package com.zhj.desigin.StructureModel.bridge;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public abstract class Pen {
    protected Color color;

    public abstract void draw();

    public void setColor(Color color){
        this.color = color;
    }

}
