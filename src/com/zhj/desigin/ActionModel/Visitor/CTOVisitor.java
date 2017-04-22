package com.zhj.desigin.ActionModel.Visitor;

/**
 * CTO 类型，只关注技术层面上的贡献
 */
public class CTOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 : "+engineer.name + " , 代码行数：" + engineer.getCodeLine());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理 : "+manager.name + " , 产品数量：" + manager.getProducts());
    }
}
