package com.zhj.desigin.ActionModel.Visitor;

import java.util.Random;

/**
 * 员工基类
 */
public abstract class Staff {
    public String name;

    //员工KPI
    public int kpi;

    public Staff(String name){
        this.name = name;
        kpi = new Random().nextInt();
    }

    // 接受visitor的访问
    public abstract void accept(Visitor visitor);
}
