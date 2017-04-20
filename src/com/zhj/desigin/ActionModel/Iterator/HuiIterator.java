package com.zhj.desigin.ActionModel.Iterator;

/**
 * 小辉部门的迭代器
 */
public class HuiIterator implements Iterator{
    private Employee[] employees;
    private int position;

    public HuiIterator(Employee[] employees){
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return !(position > employees.length - 1 || employees[position] == null);
    }

    @Override
    public Object next() {
        Employee e = employees[position];
        position++;

        return e;
    }
}
