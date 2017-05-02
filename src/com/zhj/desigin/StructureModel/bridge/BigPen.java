package com.zhj.desigin.StructureModel.bridge;


/**
 * 大号的笔
 */
public class BigPen extends Pen{
    @Override
    public void draw() {
        System.out.println("大号的 "+color.getColor()+" 画笔画画");
    }

}
