package com.zhj.desigin.StructureModel.bridge;

/**
 * 小号的笔
 */
public class SmallPen extends Pen {
    @Override
    public void draw() {
        System.out.println("小号的 " + color.getColor() + " 画笔画画");
    }
}
