package com.zhj.desigin.ActionModel.Memoto;

/**
 * Created by zhanghongjun on 16/10/20.
 * 测试备忘录模式
 */
public class MemotoTest {

    public static void test(){
        // 创建游戏
        CallOfDuty game = new CallOfDuty();

        // 1 打游戏
        game.play();

        // 2 游戏存档
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemoto(game.createMemoto());

        // 3 退出游戏
        game.quit();

        // 4 恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemoto());
    }


}
