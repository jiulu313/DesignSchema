package com.zhj.desigin.ActionModel.Visitor;

/**
 * 不使用访问者模式的写法
 */
public class ReportUtils {
    public void visit(Staff staff){
        if(staff instanceof Engineer){
            Engineer engineer = (Engineer) staff;
            System.out.println("工程师：" + engineer.name + " , KPI = "+ engineer.kpi);
        }else if(staff instanceof Manager){
            Manager manager = (Manager) staff;
            System.out.println("经理："+manager.name + " , KPI : "+manager.kpi + ",新产品数量 : "+ manager.getProducts());
        }
    }
}
