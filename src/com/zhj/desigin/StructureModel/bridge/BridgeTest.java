package com.zhj.desigin.StructureModel.bridge;

/**
 * Created by zhanghongjun on 16/10/19.
 *
 * 桥接模式关键是把抽象与行为实现相分离，动态结合。
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
