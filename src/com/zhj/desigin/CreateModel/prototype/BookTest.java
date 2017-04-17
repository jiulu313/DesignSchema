package com.zhj.desigin.CreateModel.prototype;

/**
 * Created by zhanghongjun on 16/10/18.
 */

//测试类
public class BookTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        test();
    }

    public static void test() throws CloneNotSupportedException {
        Book book = new Book();
        book.setName("JAVA设计模式");
        book.setPrice(74);
        Book book1 = book.clone();
        
        System.out.println(book1);
        System.out.println(book);

    }

}
