package com.zhj.desigin.ActionModel.command.demo2;

/**
 * 向右移动的命令
 */
public class RightCommand implements Command{
    //持有一个命令执行者的引用
    TerisMachine terisMachine;

    public void setTerisMachine(TerisMachine terisMachine){
        this.terisMachine = terisMachine;
    }

    @Override
    public void execute() {
        //调用游戏机里面的方法具体执行
        terisMachine.toRight();
    }
}
