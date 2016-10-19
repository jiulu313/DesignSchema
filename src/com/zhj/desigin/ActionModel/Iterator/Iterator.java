package com.zhj.desigin.ActionModel.Iterator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public interface Iterator {

    //是否还有下一个元素
    boolean hasNext();

    //返回当前位置的元素，并将位置移到下一位
    Object next();
}
