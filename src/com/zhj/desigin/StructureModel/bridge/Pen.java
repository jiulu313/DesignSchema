package com.zhj.desigin.StructureModel.bridge;

/**
 * 笔的抽象
 */
public abstract class Pen {
    //保存另一个变化的维度
    protected Color color;

    public abstract void draw();

    public void setColor(Color color){
        this.color = color;
    }

}
