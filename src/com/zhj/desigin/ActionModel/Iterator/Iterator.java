package com.zhj.desigin.ActionModel.Iterator;

/**
 * 迭代器接口
 */
public interface Iterator {

    //是否还有下一个元素
    boolean hasNext();

    //返回当前位置的元素，并将位置移到下一位
    Object next();
}
