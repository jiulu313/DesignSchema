package com.zhj.desigin.CreateModel.prototype;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class BookTest {

    public static void test() throws CloneNotSupportedException {
        Book book = new Book();
        book.setName("JAVA设计模式");
        book.setPrice(74);
        System.out.println(book);


        Book book1 = book.clone();
        System.out.println(book1);

    }

}
