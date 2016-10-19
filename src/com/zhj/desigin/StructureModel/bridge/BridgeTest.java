package com.zhj.desigin.StructureModel.bridge;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class BridgeTest {

    public static void test(){

        BigPen pen = new BigPen();
        pen.setColor(new RedColor());
        pen.draw();

        pen.setColor(new GreenColor());
        pen.draw();

        pen.setColor(new BlueColor());
        pen.draw();
    }


}
