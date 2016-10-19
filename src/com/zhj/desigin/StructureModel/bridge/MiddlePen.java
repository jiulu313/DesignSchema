package com.zhj.desigin.StructureModel.bridge;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class MiddlePen extends Pen{
    @Override
    public void draw() {
        System.out.println("中号的 "+color.getColor()+" 画笔画画");
    }
}
