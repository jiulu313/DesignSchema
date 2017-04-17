package com.zhj.desigin.ActionModel.Memoto;


/**
 * 使命召唤游戏
 * 该功能就是将在游戏进度存储到文件系统或者数据库中，下次再进入时从本地加载进度
 * 使得玩家能够继续上一次的游戏之旅。下面是用代码演示备忘录在此种场景中的应用
 */
public class CallOfDuty {
    private int mLifeValue = 100;
    private int mCheckPoint = 1;

    //玩游戏
    public void play() {
        System.out.println("玩游戏：第" + mCheckPoint + "关，奋战杀敌中");
        mLifeValue -= 30;
        mCheckPoint++;
        System.out.println("到达第" + mCheckPoint + "关");
    }

    //退出游戏
    public void quit() {
        System.out.println("======== 退出游戏前的状态 =========");
        System.out.println("mCheckPoint=" + mCheckPoint+" mLifeValue=" + mLifeValue );
    }

    //创建备忘录
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mLifeValue = mLifeValue;
        memoto.mCheckPoint = mCheckPoint;

        return memoto;
    }

    //恢复游戏
    public void restore(Memoto memoto) {
        this.mLifeValue = memoto.mLifeValue;
        this.mCheckPoint = memoto.mCheckPoint;

        System.out.println("======== 恢复游戏后的状态 =========");
        System.out.println(memoto);
    }


}
