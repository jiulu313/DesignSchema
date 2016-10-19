package com.zhj.desigin.StructureModel.bridge;

import com.zhj.desigin.StructureModel.facade.SystemB;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class BigPen extends Pen{
    @Override
    public void draw() {
        System.out.println("大号的 "+color.getColor()+" 画笔画画");
    }

}
