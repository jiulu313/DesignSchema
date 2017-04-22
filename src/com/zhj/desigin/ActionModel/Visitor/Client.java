package com.zhj.desigin.ActionModel.Visitor;

/**
 *  客户端
 */
public class Client {
    public static void main(String[] args){
        //构建报表
        BusinessReport businessReport = new BusinessReport();
        System.out.println("========== 给CEO看的报表 ============");
        businessReport.showReport(new CEOVisitor());
        System.out.println("========== 给CTO看的报表 ============");
        businessReport.showReport(new CTOVisitor());
    }
}
