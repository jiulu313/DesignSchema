package com.zhj.desigin.ActionModel.command.demo2;

/**
 * 改变形状的命令
 */
public class TransformCommand implements Command{
    //持有一个命令执行者的引用
    TerisMachine terisMachine;

    public void setTerisMachine(TerisMachine terisMachine){
        this.terisMachine = terisMachine;
    }

    @Override
    public void execute() {
        //调用游戏机里面的方法具体执行
        terisMachine.transform();
    }
}
