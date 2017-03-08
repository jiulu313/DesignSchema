package com.zhj.desigin.ActionModel.Chain;

/**
 * Created by zhanghongjun on 16/10/20.
 * 责任链模式,有两种情况:
 * 1 先自己处理,自己处理不了,再交给上级处理
 * 2 先交给上级处理,上级处理不了,再自己处理(比如类的加载机制)
 */
public class ChainTest {

    public static void test(){
        Leader groupLeader = new GroupLeader();
        Leader directorLeader = new Director();
        Leader boss = new Boss();

        groupLeader.setPreLeader(directorLeader);
        directorLeader.setPreLeader(boss);
        boss.setPreLeader(null);

        groupLeader.handleRequest(50000);

    }


}
