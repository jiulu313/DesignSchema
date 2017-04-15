package com.zhj.desigin.DesignPrinciples.principles1;


/**
 * Created by zhanghongjun on 2017/4/15.
 * 单一原则
 */

//作家
public class Author {
    private String bookName;

    //写一本书
    public String writeBook() {
        System.out.println("在写一本" + bookName + "书");
        return bookName;
    }

}
