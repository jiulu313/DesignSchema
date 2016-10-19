package com.zhj.desigin.ActionModel.Iterator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class CompanyHui implements Company{
    private Employee[] employees = new Employee[3];

    public CompanyHui(){
        employees[0] = new Employee("tom",23);
        employees[1] = new Employee("jim",24);
        employees[2] = new Employee("tim",25);
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(employees);
    }
}
