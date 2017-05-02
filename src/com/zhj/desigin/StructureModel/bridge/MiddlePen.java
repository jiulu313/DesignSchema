package com.zhj.desigin.StructureModel.bridge;

/**
 * 中号的笔
 */
public class MiddlePen extends Pen{
    @Override
    public void draw() {
        System.out.println("中号的 "+color.getColor()+" 画笔画画");
    }
}
