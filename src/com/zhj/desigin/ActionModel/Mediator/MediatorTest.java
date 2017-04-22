package com.zhj.desigin.ActionModel.Mediator;

/**
 * 中介者模式 测试类
 */
public class MediatorTest {

    public static void test(){
        //构造一个主板
        MainBoard mediator = new MainBoard();

        //分别构造各种零件
        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard graphicsCard = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);

        //将各个零件安装到主板
        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setSoundCard(soundCard);
        mediator.setGraphicsCard(graphicsCard);

        //完成后可以开始播放片了
        cdDevice.load();
    }
}
