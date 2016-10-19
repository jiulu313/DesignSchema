package com.zhj.desigin.ActionModel.Iterator;

import java.util.List;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class MinIterator implements Iterator{
    private List<Employee> list;
    private int position;

    public MinIterator(List<Employee> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
       return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee employee = list.get(position);
        position++;

        return employee;
    }
}
