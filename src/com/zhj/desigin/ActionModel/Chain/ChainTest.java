package com.zhj.desigin.ActionModel.Chain;

/**
 * Created by zhanghongjun on 16/10/20.
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
