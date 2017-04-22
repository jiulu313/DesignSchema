package com.zhj.desigin.ActionModel.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工业务报表
 */
public class BusinessReport {
    List<Staff> mStaffs = new ArrayList<>();

    public BusinessReport(){
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师-小A"));
        mStaffs.add(new Engineer("工程师-小B"));
        mStaffs.add(new Engineer("工程师-小C"));
    }

    /**
     * 为访问者展示报表，公司高层，如CEO，CTO
     */
    public void showReport(Visitor visitor){
        for (Staff staff : mStaffs){
            staff.accept(visitor);
        }
    }
}
